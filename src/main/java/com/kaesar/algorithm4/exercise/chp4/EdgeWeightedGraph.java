package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.In;
import com.kaesar.algorithm4.exercise.chp1.Bag;

/**
 * 加权无向图的数据类型
 *
 * @Author: chengk
 * @Date: 2021/5/19 11:12 下午
 */
public class EdgeWeightedGraph {
    private final int V; // 顶点总数
    private int E; // 边的总数
    private Bag<Edge>[] adj; // // 邻接表

    /**
     * 创建一副含有V个顶点的空图
     *
     * @param V
     */
    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<>();
        }
    }

    /**
     * 从输入流中读取图
     *
     * @param in
     */
    public EdgeWeightedGraph(In in) {
        // TODO: 2021/5/19
        this.V = 0;
        this.E = 0;
    }

    /**
     * 图的顶点数
     *
     * @return
     */
    public int V() {
        return V;
    }

    /**
     * 图的边数
     *
     * @return
     */
    public int E() {
        return E;
    }

    /**
     * 向图中添加一条边
     *
     * @param e
     */
    public void addEdge(Edge e) {
        int v = e.either(), w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    /**
     * 和v相关联的所有边
     *
     * @param v
     * @return
     */
    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    /**
     * 图的所有边
     *
     * @return
     */
    public Iterable<Edge> edges() {
        Bag<Edge> b = new Bag<>();
        for (int v = 0; v < V; v++) {
            for (Edge e : adj[v]) {
                if (e.other(v) > v) {
                    b.add(e);
                }
            }
        }
        return b;
    }

    /**
     * 对象的字符串表示
     *
     * @return
     */
    public String toString() {
        // TODO: 2021/5/19
        return null;
    }
}
