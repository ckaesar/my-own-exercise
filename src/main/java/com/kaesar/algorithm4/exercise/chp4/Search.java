package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.exercise.chp1.Queue;

import java.util.HashSet;
import java.util.Set;

/**
 * 图处理算法的API
 */
public class Search {

    private Graph graph;
    private int s;

    /**
     * 找到和起点s连通的所有顶点
     *
     * @param G
     * @param s
     */
    public Search(Graph G, int s) {
        this.graph = G;
        this.s = s;
    }

    /**
     * v和s是连通的吗
     *
     * @param v
     * @return
     */
    public boolean marked(int v) {
        for (int w : graph.adj(s)) {
            if (w == v) {
                return true;
            }
        }
        return false;
    }

    /**
     * 与s连通的顶点总数
     *
     * @return
     */
    public int count() {
        int result = 0;
        Queue<Integer> related = new Queue<>();
        Set<Integer> notRepeat = new HashSet<>();
        for (int w : graph.adj(s)) {
            if (notRepeat.add(w)) {
                related.enqueue(w);
                notRepeat.add(w);
            }
        }
        while (!related.isEmpty()) {
            for (int w : graph.adj(related.dequeue())) {
                if (notRepeat.add(w)) {
                    related.enqueue(w);
                    notRepeat.add(w);
                }
            }
        }
        return notRepeat.size();
    }
}
