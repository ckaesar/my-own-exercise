package com.kaesar.sword2offer;

/**
 * 标题：矩形覆盖
 * 题目描述
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * <p>
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 * 题目链接
 * https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&&tqId=11163&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz10 {

  /**
   * 方法：要覆盖 2*n 的大矩形，可以先覆盖 2*1 的矩形，再覆盖 2*(n-1) 的矩形；
   * 或者先覆盖 2*2 的矩形，再覆盖 2*(n-2) 的矩形。而覆盖 2*(n-1) 和 2*(n-2) 的矩形可以看成子问题。
   *
   * @param target
   * @return
   */
  public int rectCover(int target) {
    if (target <= 2) {
      return target;
    }
    int first = 1, second = 2;
    for (int i = 3; i <= target; i++) {
      second = second + first;
      first = second - first;
    }
    return second;
  }

  public static void main(String[] args) {
    Jz10 jz10 = new Jz10();
    for(int i = 1; i < 10; i++) {
      System.out.println(jz10.rectCover(i));
    }
  }
}
