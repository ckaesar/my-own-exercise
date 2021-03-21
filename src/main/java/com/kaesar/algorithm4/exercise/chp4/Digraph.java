package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.In;
import com.kaesar.algorithm4.exercise.chp1.Bag;

/**
 * 有向图
 */
public class Digraph {
    private final int V; // 顶点数目

    private int E; // 边的数目

    private Bag<Integer>[] adj; // 邻接表

    /**
     * 创建一副含有V个顶点但没有边的有向图
     *
     * @param V
     */
    public Digraph(int V) {
        this.V = V;
        this.E = 0;

        adj = new Bag[V]; // 创建邻接表
        for (int v = 0; v < V; v++) {
            // 将所有链表初始化为空
            adj[v] = new Bag<>();
        }
    }

    /**
     * 从输入流in中读取一副有向图
     *
     * @param in
     */
    public Digraph(In in) {
        this(in.readInt()); // 读取V并将图初始化

        int E = in.readInt(); // 读取边
        for (int i = 0; i < E; i++) {
            int v = in.readInt(); // 读取一个顶点
            int w = in.readInt(); // 读取另一个顶点
            // 添加一条有向边 v -> w
            addEdge(v, w);
        }
    }

    /**
     * 顶点总数
     *
     * @return
     */
    public int V() {
        return this.V;
    }

    /**
     * 边的总数
     *
     * @return
     */
    public int E() {
        return this.E;
    }

    // 向有向图中添加一条 v -> w 的边
    public void addEdge(int v, int w) {
        adj[v].add(w); // 将w添加到v的链表中
        E++;
    }

    /**
     * 由v指出的边锁连接的所有顶点
     *
     * @param v
     * @return
     */
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    /**
     * 该图的反向图
     *
     * @return
     */
    public Digraph reverse() {
        Digraph R = new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (int w : adj(v)) {
                R.addEdge(w, v);
            }
        }
        return R;
    }

    /**
     * 图的邻接表的字符串表示（Digraph的实例方法）
     *
     * @return
     */
    @Override
    public String toString() {
        String s = V + " vertices, " + E + " edges\n";
        for (int v = 0; v < V; v++) {
            s += v + ": ";
            for (int w : this.adj(v)) {
                s += w + " ";
            }
            s += "\n";
        }
        return s;
    }
}
