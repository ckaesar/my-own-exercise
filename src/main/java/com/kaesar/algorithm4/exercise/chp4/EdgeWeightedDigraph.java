package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.In;
import com.kaesar.algorithm4.exercise.chp1.Bag;

/**
 * 加权有向图的数据类型
 *
 * @Author: chengk
 * @Date: 2021/5/23 10:09 上午
 */
public class EdgeWeightedDigraph {
    private final int V; // 顶点总数
    private int E; // 边的总数
    private Bag<DirectedEdge>[] adj; // 邻接表

    /**
     * 含有V个顶点的空有向图
     *
     * @param V
     */
    public EdgeWeightedDigraph(int V) {
        this.V = V;
        this.E = 0;
        adj = new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<DirectedEdge>();
        }
    }

    /**
     * 从输入流中读取图的构造函数
     *
     * @param in
     */
    public EdgeWeightedDigraph(In in) {
        // TODO: 2021/5/23  请见练习4.4.2
        this.V = 0;
    }

    /**
     * 顶点总数
     *
     * @return
     */
    public int V() {
        return V;
    }

    /**
     * 边的总数
     *
     * @return
     */
    public int E() {
        return E;
    }

    /**
     * 将e添加到该有向图中
     *
     * @param e
     */
    public void addEdge(DirectedEdge e) {
        adj[e.from()].add(e);
        E++;
    }

    /**
     * 从v指出的边
     *
     * @param v
     * @return
     */
    public Iterable<DirectedEdge> adj(int v) {
        return adj[v];
    }

    /**
     * 该有向图中的所有边
     *
     * @return
     */
    public Iterable<DirectedEdge> edges() {
        Bag<DirectedEdge> bag = new Bag<>();
        for (int v = 0; v < V; v++) {
            for (DirectedEdge e : adj[v]) {
                bag.add(e);
            }
        }
        return bag;
    }

    /**
     * 对象的字符串表示
     *
     * @return
     */
    @Override
    public String toString() {
        // TODO: 2021/5/23
        return this.toString();
    }
}
