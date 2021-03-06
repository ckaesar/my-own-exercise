package com.kaesar.sword2offer;

/**
 * 标题：二维数组中的查找
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样
 * 的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 题目链接
 * https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Jz01 {

  public static boolean find11(int target, int[][] array) {
    if (array == null || array.length == 0 || array[0].length == 0) {
      return false;
    }
    int rows = array.length, cols = array[0].length;
    int row = 0, col = cols - 1;
    int n = array[row][col];
    while (row < rows && col >= 0) {
      if (array[row][col] < target) {
        row++;
      } else if (array[row][col] == target) {
        return true;
      } else if (array[row][col] > target) {
        col--;
      }
    }
    return false;
  }


  /**
   * 暴力破解法
   *
   * @param target
   * @param array
   * @return
   */
  public static boolean find(int target, int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] == target) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * 二分查找
   *
   * @param target
   * @param array
   * @return
   */
  public static boolean find1(int target, int[][] array) {
    // 判断数组是否为空
    int row = array.length;
    if (row == 0) {
      return false;
    }
    int column = array[0].length;
    if (column == 0) {
      return false;
    }
    int r = 0, c = column - 1; // 右上角元素，从右上角元素开始查找
    while (r < row && c >= 0) {
      if (target == array[r][c]) {
        return true;
      } else if (target > array[r][c]) {
        ++r;
      } else {
        --c;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[][] ex1 = new int[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        ex1[i][j] = i + j;
      }
    }

    System.out.println(find(4, ex1));
    System.out.println(find1(4, ex1));
    System.out.println(find11(4, ex1));
    System.out.println(find(222, ex1));
    System.out.println(find1(222, ex1));
    System.out.println(find11(222, ex1));
  }
}
