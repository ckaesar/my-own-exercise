package com.kaesar.sword2offer;

/**
 * 标题：第一个只出现一次的字符位置
 * 题目描述
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数
 * 题目链接：
 * https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=13&&tqId=11187&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz34 {

  public int firstNotRepeatingChar(String str) {
    int[] cnts = new int[256];
    for (int i = 0; i < str.length(); i++)
      cnts[str.charAt(i)]++;
    for (int i = 0; i < str.length(); i++)
      if (cnts[str.charAt(i)] == 1) {
        return i;
      }
    return -1;
  }

  public static void main(String[] args) {

  }
}
