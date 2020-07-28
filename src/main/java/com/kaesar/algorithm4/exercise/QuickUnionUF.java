package com.kaesar.algorithm4.exercise;

public class QuickUnionUF {
  private int[] id; // 分量id（以触点作为索引）
  private int count; // 分量数量

  public QuickUnionUF(int N) {
    // 初始化分量id数组
    count = N;
    id = new int[N];
    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  /**
   * 连通分量的数量
   *
   * @return
   */
  public int count() {
    return count;
  }

  public int find(int p) {
    // 找出分量的名称
    while (p != id[p]) {
      p = id[p];
    }
    return p;
  }

  public void union(int p, int q) {
    // 将p和q的根结点统一
    int pRoot = find(p);
    int qRoot = find(q);
    if (pRoot == qRoot) {
      return;
    }

    id[pRoot] = qRoot;
    count--;
  }
}
