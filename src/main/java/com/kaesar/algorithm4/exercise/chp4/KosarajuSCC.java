package com.kaesar.algorithm4.exercise.chp4;

/**
 * 计算有向图中强连通分量的Kosaraju算法
 */
public class KosarajuSCC {
    private boolean[] marked; // 已访问过的顶点
    private int[] id; // 强连通分量的标识符
    private int count; // 强连通分量的数量

    /**
     * 预处理构造函数
     *
     * @param G
     */
    public KosarajuSCC(Digraph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        DepthFirstOrder order = new DepthFirstOrder(G.reverse());
        for (int s : order.reversePost()) {
            if (!marked[s]) {
                dfs(G, s);
                count++;
            }
        }
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    /**
     * v和w是否是强连通的
     *
     * @param v
     * @param w
     * @return
     */
    public boolean stronglyConnected(int v, int w) {
        return id[v] == id[w];
    }

    /**
     * v所在的强连通分量的标识符(在0至count()-1之间)
     *
     * @param v
     * @return
     */
    public int id(int v) {
        return id[v];
    }

    /**
     * 图中的强连通分量的总数
     *
     * @return
     */
    public int count() {
        return count;
    }
}
