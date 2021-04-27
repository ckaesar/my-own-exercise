package com.kaesar.algorithm4.exercise.chp4;

/**
 * 有向图中计算顶点对的可达性
 */
public class TransitiveClosure {
    private DirectedDFS[] all;

    /**
     * 预处理的构造函数
     *
     * @param G
     */
    TransitiveClosure(Digraph G) {
        all = new DirectedDFS[G.V()];
        for (int v = 0; v < G.V(); v++) {
            all[v] = new DirectedDFS(G, v);
        }
    }

    /**
     * 判断w是从v可达的吗
     *
     * @param v
     * @param w
     * @return
     */
    boolean reachable(int v, int w) {
        return all[v].marked(w);
    }
}
