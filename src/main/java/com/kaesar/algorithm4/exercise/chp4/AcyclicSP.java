package com.kaesar.algorithm4.exercise.chp4;

/**
 * 无环加权有向图中的最短路径算法
 *
 * @Author: chengk
 * @Date: 2021/5/29 9:03 上午
 */
public class AcyclicSP {
    private DirectedEdge[] edgeTo;
    private double[] distTo;

    public AcyclicSP(EdgeWeightedDigraph G, int s) {
        edgeTo = new DirectedEdge[G.V()];
        distTo = new double[G.V()];
        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0.0;
//        Topological top = new Topological(G);
        Topological top = null; // TODO: 2021/5/29
        for (int v : top.order()) {
            relax(G, v);
        }
    }

    private void relax(EdgeWeightedDigraph G, int v) {
        // TODO: 2021/5/29 请见4.4.2.5框注"顶点的松弛"
    }

    public double distTo(int v) {
        // TODO: 2021/5/29 请见4.4.2.6框注"最短路径"
        return 0.0;
    }

    public Iterable<DirectedEdge> pathTo(int v) {
        // TODO: 2021/5/29 API的查询方法
        return null;
    }
}
