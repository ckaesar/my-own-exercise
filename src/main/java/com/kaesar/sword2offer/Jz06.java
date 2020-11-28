package com.kaesar.sword2offer;

/**
 * 标题：旋转数组的最小数字
 * 题目描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 题目链接：
 * https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&&tqId=11159&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz06 {

  public int minNumberInRotateArray(int[] array) {
    if (array.length == 0) {
      return 0;
    }
    int l = 0, h = array.length - 1;
    while (l < h) {
      int m = l + (h - l) / 2;
      if (array[l] == array[m] && array[m] == array[h]) {
        return minNumber(array, l, h);
      } else if (array[m] <= array[h]) {
        h = m;
      } else {
        l = m + 1;
      }
    }
    return array[l];
  }

  private int minNumber(int[] array, int l, int h) {
    for (int i = l; i < h; i++) {
      if (array[i] > array[i + 1]) {
        return array[i + 1];
      }
    }
    return array[l];
  }

  public static void main(String[] args) {
    Jz06 jz06 = new Jz06();
    int[] array = new int[] {3, 4, 5, 1, 2};
    System.out.println(jz06.minNumberInRotateArray(array));
  }
}

