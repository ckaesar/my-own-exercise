package com.kaesar.sword2offer;

/**
 * 标题：数组中只出现一次的数字
 * 题目描述
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 题目链接：
 * https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811?tpId=13&&tqId=11193&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz40 {

  /**
   * 位运算
   * @param array
   * @param num1
   * @param num2
   */
  public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
    int diff = 0;
    for (int num : array)
      diff ^= num;
    diff &= -diff;
    for (int num : array) {
      if ((num & diff) == 0) {
        num1[0] ^= num;
      } else {
        num2[0] ^= num;
      }
    }
  }
}
