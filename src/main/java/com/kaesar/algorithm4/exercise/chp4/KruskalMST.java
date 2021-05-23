package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.MinPQ;
import com.kaesar.algorithm4.exercise.chp1.Queue;
import com.kaesar.algorithm4.exercise.chp1.UF;

/**
 * 最小生成树的Kruskal算法
 *
 * @Author: chengk
 * @Date: 2021/5/23 9:23 上午
 */
public class KruskalMST {
    private Queue<Edge> mst;

    public KruskalMST(EdgeWeightedGraph G) {
        mst = new Queue<>();
        MinPQ<Edge> pq = new MinPQ<>();
        for (Edge e : G.edges()) {
            pq.insert(e);
        }
        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.delMin(); // 从pq得到权重最小的边和它的顶点
            int v = e.either(), w = e.other(v);
            if (uf.connected(v, w)) {
                continue; // 忽略失效的边
            }
            uf.union(v, w); // 合并分量
            mst.enqueue(e); // 将边添加到最小生成树中

        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }

    public double weight() {
        return -1;
        // TODO: 2021/5/23
    }
}
