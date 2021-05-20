package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.In;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

/**
 * 最小生成树
 *
 * @Author: chengk
 * @Date: 2021/5/19 11:29 下午
 */
public class MST {
    /**
     * 构造函数
     *
     * @param G
     */
    public MST(EdgeWeightedGraph G) {

    }

    /**
     * 最小生成树的所有边
     *
     * @return
     */
    public Iterable<Edge> edges() {
        return null;
    }

    /**
     * 最小生成树的权重
     *
     * @return
     */
    public double weight() {
        return 0;
    }

    /**
     * 最小生成树的测试用例
     *
     * @param args
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        EdgeWeightedGraph G;
        G = new EdgeWeightedGraph(in);

        MST mst = new MST(G);
        for (Edge e : mst.edges()) {
            StdOut.println(e);
        }
        StdOut.println(mst.weight());
    }
}
