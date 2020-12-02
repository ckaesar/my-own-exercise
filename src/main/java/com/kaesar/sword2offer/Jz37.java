package com.kaesar.sword2offer;

/**
 * 标题：数字在排序数组中出现的次数
 * 题目描述
 * 统计一个数字在升序数组中出现的次数。
 * 题目链接：
 * https://www.nowcoder.com/practice/70610bf967994b22bb1c26f9ae901fa2?tpId=13&&tqId=11190&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz37 {

  /**
   * 暴力法
   * @param array
   * @param k
   * @return
   */
  public int getNumberOfK(int[] array, int k) {
    if (array == null || array.length == 0) {
      return 0;
    }
    int cnt = 0;
    for (int i = 0; i < array.length; i++) {
      if (k == array[i]) {
        cnt++;
      }
    }
    return cnt;
  }
}
