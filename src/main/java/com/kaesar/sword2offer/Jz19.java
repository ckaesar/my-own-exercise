package com.kaesar.sword2offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 标题：顺时针打印矩阵
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4
 * 矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 题目链接：
 * https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&&tqId=11172&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz19 {

  public ArrayList<Integer> printMatrix11(int[][] matrix) {
    ArrayList<Integer> list = new ArrayList<>();
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return list;
    }
    int up = 0;
    int down = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;
    while (true) {
      // 最上面一行
      for (int col = left; col <= right; col++) {
        list.add(matrix[up][col]);
      }
      // 向下逼近
      up++;
      // 判断是否越界
      if (up > down) {
        break;
      }
      // 最右边一行
      for (int row = up; row <= down; row++) {
        list.add(matrix[row][right]);
      }
      // 向左逼近
      right--;
      // 判断是否越界
      if (left > right) {
        break;
      }
      // 最下面一行
      for (int col = right; col >= left; col--) {
        list.add(matrix[down][col]);
      }
      // 向上逼近
      down--;
      // 判断是否越界
      if (up > down) {
        break;
      }
      // 最左边一行
      for (int row = down; row >= up; row--) {
        list.add(matrix[row][left]);
      }
      // 向右逼近
      left++;
      // 判断是否越界
      if (left > right) {
        break;
      }
    }
    return list;
  }


  public ArrayList<Integer> printMatrix(int[][] matrix) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;
    while (r1 <= r2 && c1 <= c2) {
      for (int i = c1; i <= c2; i++) {
        result.add(matrix[r1][i]);
      }
      for (int i = r1 + 1; i <= r2; i++) {
        result.add(matrix[i][c2]);
      }
      if (r1 != r2) {
        for (int i = c2 - 1; i >= c1; i--) {
          result.add(matrix[r2][i]);
        }
      }
      if (c1 != c2) {
        for (int i = r2 - 1; i > r1; i--) {
          result.add(matrix[i][c1]);
        }
      }
      r1++;
      r2--;
      c1++;
      c2--;
    }
    return result;
  }
}

