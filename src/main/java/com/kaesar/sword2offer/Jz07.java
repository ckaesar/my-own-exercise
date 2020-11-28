package com.kaesar.sword2offer;

/**
 * 标题：斐波那契数列
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 * 题目链接
 * https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&&tqId=11160&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz07 {

  public int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    Jz07 jz07 = new Jz07();
    System.out.println(jz07.fibonacci(4));
  }
}
