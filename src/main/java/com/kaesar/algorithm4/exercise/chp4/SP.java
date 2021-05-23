package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.In;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

/**
 * 最短路径的API
 *
 * @Author: chengk
 * @Date: 2021/5/23 10:23 上午
 */
public class SP {
    /**
     * 构造函数
     *
     * @param G
     * @param s
     */
    public SP(EdgeWeightedDigraph G, int s) {

    }

    /**
     * 从顶点s到v的举例，如果不存在则路径为无穷大
     *
     * @param v
     * @return
     */
    public double distTo(int v) {
        // TODO: 2021/5/23
        return Double.MAX_VALUE;
    }

    /**
     * 是否存在从顶点s到v的路径
     *
     * @return
     */
    public boolean hasPathTo(int v) {
        // TODO: 2021/5/23
        return false;
    }

    /**
     * 从顶点s到v的路径，如果不存在则为null
     *
     * @param v
     * @return
     */
    public Iterable<DirectedEdge> pathTo(int v) {
        // TODO: 2021/5/23
        return null;
    }

    public static void main(String[] args) {
        EdgeWeightedDigraph G;
        G = new EdgeWeightedDigraph(new In((args[0])));
        int s = Integer.parseInt(args[1]);
        SP sp = new SP(G, s);

        for (int t = 0; t < G.V(); t++) {
            StdOut.print(s + " to " + t);
            StdOut.printf("(%4.2f):", sp.distTo(t));
            if (sp.hasPathTo(t)) {
                for (DirectedEdge e : sp.pathTo(t)) {
                    StdOut.print(e + "   ");
                }
            }
            StdOut.println();
        }
    }
}
