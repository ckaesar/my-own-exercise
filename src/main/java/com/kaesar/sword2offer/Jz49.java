package com.kaesar.sword2offer;

/**
 * 标题：把字符串转换成整数
 * 题目描述
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空
 * 返回值描述:
 * 如果是合法的数值表达则返回该数字，否则返回0
 * 题目链接：
 * https://www.nowcoder.com/practice/1277c681251b4372bdef344468e4f26e?tpId=13&&tqId=11202&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz49 {

  public int strToInt(String str) {
    if (str == null || str.length() == 0) {
      return 0;
    }
    boolean isNegative = str.charAt(0) == '-';
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (i == 0 && (c == '+' || c == '-')) {
        continue;
      }
      if (c < '0' || c > '9') {
        return 0;
      }
      result = result * 10 + (c - '0');
    }
    return isNegative ? -result : result;
  }

  public static void main(String[] args) {
    Jz49 jz49 = new Jz49();
    System.out.println(jz49.strToInt("+32293023a"));
    System.out.println(jz49.strToInt("+2392032"));
    System.out.println(jz49.strToInt("2293043a"));
    System.out.println(jz49.strToInt("-fd3323"));
    System.out.println(jz49.strToInt("-23232942"));
    System.out.println(jz49.strToInt("292930203"));
  }
}

