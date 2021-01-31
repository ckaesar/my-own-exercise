package com.kaesar.algorithm4.exercise.chp1;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdIn;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

/**
 * quick-find算法
 */
public class QuickFindUF {
  private int[] id; // 分量id（以触点作为索引）
  private int count; // 分量数量

  public QuickFindUF(int N) {
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

  /**
   * 如果p和q存在同一个分量中则返回true
   *
   * @param p
   * @param q
   * @return
   */
  public boolean connected(int p, int q) {
    return find(p) == find(q);
  }

  /**
   * p所在的分量的标识符（0到N-1）
   *
   * @param p
   * @return
   */
  public int find(int p) {
    return id[p];
  }

  /**
   * 在p和q之间添加一条连接
   *
   * @param p
   * @param q
   */
  public void union(int p, int q) {
    // 将p和q归并到相同的分量中
    int pID = find(p);
    int qID = find(q);

    // 如果p和q已经在相同的分量之中则不需要采取任何行动
    if (pID == qID) {
      return;
    }

    // 将p的分量重命名为q的分量
    for (int i = 0; i < id.length; i++) {
      if (id[i] == pID) {
        id[i] = qID;
      }
    }
    count--;
  }

    public static void main(String[] args) {
      // 解决StdIn得到的动态连通性问题
      int N = StdIn.readInt(); // 读取触点数量
      QuickFindUF uf = new QuickFindUF(N); // 初始化N个分量
      while (!StdIn.isEmpty()) {
        int p = StdIn.readInt();
        int q = StdIn.readInt(); // 读取整数对
        if (uf.connected(p, q)) {
          continue; // 如果已经连通则忽略
        }
        uf.union(p, q); // 归并分量
        StdOut.println(p + " " + q); // 打印连接
      }
      StdOut.println(uf.count() + "components");
    }


}
