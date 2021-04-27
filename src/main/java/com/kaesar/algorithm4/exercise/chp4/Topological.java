package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

/**
 * 拓扑排序
 */
public class Topological {
    private Iterable<Integer> order; // 顶点的拓扑顺序

    public Topological(Digraph G) {
        DirectedCycle cycleFinder = new DirectedCycle(G);
        if (!cycleFinder.hasCycle()) {
            DepthFirstOrder dfs = new DepthFirstOrder(G);
            order = dfs.reversePost();
        }
    }

    /**
     * 拓扑排序的所有顶点
     *
     * @return
     */
    public Iterable<Integer> order() {
        return order;
    }

    /**
     * G是有向无环图吗
     *
     * @return
     */
    public boolean isDAG() {
        return order != null;
    }

    public static void main(String[] args) {
        String fileName = args[0];
        String separator = args[1];
        SymbolDigraph sg = new SymbolDigraph(fileName, separator);
        Topological top = new Topological(sg.G());
        for (int v : top.order) {
            StdOut.println(sg.name(v));
        }
    }
}
