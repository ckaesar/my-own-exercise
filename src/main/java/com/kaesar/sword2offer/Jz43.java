package com.kaesar.sword2offer;

/**
 * 标题：左旋转字符串
 * 题目描述
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
 * 请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * 题目链接：
 * https://www.nowcoder.com/practice/12d959b108cb42b1ab72cef4d36af5ec?tpId=13&&tqId=11196&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz43 {

  /**
   * 用额外的空间
   * @param str
   * @param n
   * @return
   */
  public String leftRotateString(String str, int n) {
    if (str == null || str.length() == 0) {
      return str;
    }
    char[] result = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      int newIndex = (i - n + str.length()) % str.length();
      result[newIndex] = str.charAt(i);
    }
    return new String(result);
  }

  /**
   * 字符串操作
   * @param str
   * @param n
   * @return
   */
  public String leftRotateString2(String str, int n) {
    if (n >= str.length()) {
      return str;
    }
    char[] chars = str.toCharArray();
    reverse(chars, 0, n - 1);
    reverse(chars, n, chars.length - 1);
    reverse(chars, 0, chars.length - 1);
    return new String(chars);
  }

  private void reverse(char[] chars, int i, int j) {
    while (i < j)
      swap(chars, i++, j--);
  }

  private void swap(char[] chars, int i, int j) {
    char t = chars[i];
    chars[i] = chars[j];
    chars[j] = t;
  }
}
