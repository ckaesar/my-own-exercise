package com.kaesar.sword2offer;

import java.util.ArrayList;

/**
 * 标题：和为 S 的两个数字
 * 题目描述
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 返回值描述:
 * 对应每个测试案例，输出两个数，小的先输出。
 * 题目链接：
 * https://www.nowcoder.com/practice/390da4f7a00f44bea7c2f3d19491311b?tpId=13&&tqId=11195&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz42 {

  public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
    ArrayList<Integer> result = new ArrayList<>();
    int first = 0, second = 0, index = 0;
    for (int i = 0; i < array.length - 1; i++) {
      int start = array[i];
      for (int j = 1; j < array.length && j >= index; j++) {
        if (array[i] + array[j] == sum) {
          index = j;
          if (first == 0 || array[i] * array[j] < first * second) {
            first = array[i];
            second = array[j];
          }
          break;
        }
      }
    }
    if (first == 0 && second == 0) {
      return result;
    }
    result.add(first);
    result.add(second);
    return result;
  }
}
