package com.kaesar.sword2offer;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * 标题：机器人的运动范围
 * 题目描述
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位
 * 之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。
 * 请问该机器人能够达到多少个格子？
 * 题目链接：
 * https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8?tpId=13&&tqId=11219&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz66 {

  private static final int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
  private int cnt = 0;
  private int rows;
  private int cols;
  private int threshold;
  private int[][] digitSum;

  /**
   * 深度优先搜索（Depth First Search，DFS）
   * 回溯是深度优先搜索的一种特例，它在一次搜索过程中需要设置一些本次搜索过程的局部状态，并在本次搜索结束之后清除状态。
   * 而普通的深度优先搜索并不需要使用这些局部状态，虽然还是有可能设置一些全局状态。
   *
   * @param threshold
   * @param rows
   * @param cols
   * @return
   */
  public int movingCount(int threshold, int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    this.threshold = threshold;
    initDigitSum();
    boolean[][] marked = new boolean[rows][cols];
    dfs(marked, 0, 0);
    return cnt;
  }

  private void dfs(boolean[][] marked, int r, int c) {
    if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c]) {
      return;
    }
    marked[r][c] = true;
    if (this.digitSum[r][c] > this.threshold) {
      return;
    }
    cnt++;
    for (int[] n : next) {
      dfs(marked, r + n[0], c + n[1]);
    }
  }

  private void initDigitSum() {
    int[] digitSumOne = new int[Math.max(rows, cols)];
    for (int i = 0; i < digitSumOne.length; i++) {
      int n = i;
      while (n > 0) {
        digitSumOne[i] += n % 10;
        n /= 10;
      }
    }
    this.digitSum = new int[rows][cols];
    for (int i = 0; i < this.rows; i++) {
      for (int j = 0; j < this.cols; j++) {
        this.digitSum[i][j] = digitSumOne[i] + digitSumOne[j];
      }
    }
  }

  public static void main(String[] args) {
    Jz66 jz66 = new Jz66();
    int i = jz66.movingCount(18, 20, 20);
    System.out.println(i);
    System.out.println(4/10);
  }
}