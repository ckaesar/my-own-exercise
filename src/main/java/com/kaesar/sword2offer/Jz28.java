package com.kaesar.sword2offer;

/**
 * 标题：数组中出现次数超过一半的数字
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 题目链接：
 * https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=13&&tqId=11181&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz28 {

  public int moreThanHalfNum_Solution(int[] array) {
    int majority = array[0];
    for (int i = 1, cnt = 1; i < array.length; i++) {
      if (array[i] == majority) {
        cnt++;
      } else {
        cnt--;
      }
      if (cnt == 0) {
        majority = array[i];
        cnt = 1;
      }
    }
    int cnt = 0;
    for (int val : array) {
      if (val == majority) {
        cnt++;
      }
    }
    return cnt > array.length / 2 ? majority : 0;
  }
}