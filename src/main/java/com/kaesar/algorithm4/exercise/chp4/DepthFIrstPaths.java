package com.kaesar.algorithm4.exercise.chp4;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.In;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;
import com.kaesar.algorithm4.exercise.chp1.Stack;

/**
 * 使用深度优先搜索查找图中的路径
 */
public class DepthFIrstPaths {
    private boolean[] marked; // 这个顶点上调用过dfs()了吗？
    private int[] edgeTo; // 从起点到一个顶点的已知路径上的最后一个顶点
    private final int s; // 起点

    public DepthFIrstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        dfs(G, s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }

    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        DepthFIrstPaths search = new DepthFIrstPaths(G, s);
        for (int v = 0; v < G.V(); v++) {
            StdOut.print(s + " to " + v + ": ");
            if (search.hasPathTo(v)) {
                for (int x : search.pathTo(v)) {
                    if (x == s) {
                        StdOut.print(x);
                    } else {
                        StdOut.print("-" + x);
                    }
                }
            }
            StdOut.println();
        }
    }
}
