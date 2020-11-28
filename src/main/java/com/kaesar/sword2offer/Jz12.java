package com.kaesar.sword2offer;

/**
 * 标题：数值的整数次方
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 * 题目链接：
 * https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&&tqId=11165&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz12 {

  public double Power(double base, int exponent) {
    double result = 0;
    if (exponent > 0) {
      result = base;
      while (exponent > 1) {
        result *= base;
        exponent--;
      }
    } else {
      result = 1;
      while (exponent <= -1) {
        result /= base;
        exponent++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Jz12 jz12 = new Jz12();
    System.out.println(jz12.Power(2, 3));
    System.out.println(jz12.Power(2, -3));
  }

}
