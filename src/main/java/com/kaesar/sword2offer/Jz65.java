package com.kaesar.sword2offer;

/**
 * 标题：矩阵中的路径
 * 题目描述
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中
 * 向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。 例如
 * a b c e
 * s f c s
 * a d e e
 * 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能
 * 再次进入该格子。
 * 题目链接：
 * https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc?tpId=13&&tqId=11218&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz65 {
  private final static int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
  private int rows;
  private int cols;

  /**
   * 回溯法
   *
   * @param matrix
   * @param rows
   * @param cols
   * @param str
   * @return
   */
  public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
    if (rows == 0 || cols == 0) {
      return false;
    }
    this.rows = rows;
    this.cols = cols;
    boolean[][] marked = new boolean[rows][cols];
    char[][] array = buildMatrix(matrix);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (backtracking(array, str, marked, 0, i, j)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathLen, int r, int c) {
    if (pathLen == str.length) {
      return true;
    }

    if (r < 0 || r >= rows || c < 0 || c >= cols || matrix[r][c] != str[pathLen] || marked[r][c]) {
      return false;
    }

    marked[r][c] = true;
    for (int[] n : next) {
      if (backtracking(matrix, str, marked, pathLen + 1, r + n[0], c + n[1])) {
        return true;
      }
    }
    marked[r][c] = false;
    return false;
  }

  private char[][] buildMatrix(char[] array) {
    char[][] matrix = new char[rows][cols];
    for (int r = 0, idx = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        matrix[r][c] = array[idx++];
      }
    }
    return matrix;
  }

  public static void main(String[] args) {
    Jz65 jz65 = new Jz65();
    Jz65 jz651 = new Jz65();
    char[] array = "abcesfcsadee".toCharArray();
    char[] array2 = "abcesfcsadee".toCharArray();
    boolean result1 = jz65.hasPath(array, 3, 4, "bcced".toCharArray());
    boolean result2 = jz651.hasPath(array2, 3, 4, "abcb".toCharArray());
    System.out.println(result1);
    System.out.println(result2);
  }
}
