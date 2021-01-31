package com.kaesar.algorithm4.exercise.chp1;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdIn;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

/**
 * union-find算法的实现
 */
public class UF {
    private int[] id; // 分量id（以触点作为索引）
    private int count; // 分量数量

    public UF(int N) {
        // 初始化分量id数组
        this.count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        // 待完成
        return 0;
    }

    public void union(int p, int q) {
        // 待完成
    }

    public static void main(String[] args) {
        // 解决有StdIn得到的动态连通性问题
        int N = StdIn.readInt(); // 读取触点数量
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt(); // 读取整数对
            if (uf.connected(p, q)) {
                // 如果已经连通则忽略
                continue;
            }
            uf.union(p, q); // 归并分量
            StdOut.println(p + " " + q); // 打印连接
        }
        StdOut.println(uf.count() + "components");
    }
}
