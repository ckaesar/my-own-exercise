package com.kaesar.sword2offer;

/**
 * 标题：表示数值的字符串
 * 题目描述
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * 题目链接：
 * https://www.nowcoder.com/practice/6f8c901d091949a5837e24bb82a731f2?tpId=13&&tqId=11206&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz53 {

  /**
   * 使用正则表达式进行匹配
   * []  ： 字符集合
   * ()  ： 分组
   * ?   ： 重复 0 ~ 1 次
   * +   ： 重复 1 ~ n 次
   * *   ： 重复 0 ~ n 次
   * .   ： 任意字符
   * \\. ： 转义后的 .
   * \\d ： 数字
   *
   * @param str
   * @return
   */
  public boolean isNumeric(char[] str) {
    if (str == null || str.length == 0) {
      return false;
    }
    return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
  }

  public static void main(String[] args) {
    Jz53 jz53 = new Jz53();
    System.out.println(jz53.isNumeric("+100".toCharArray()));
  }
}