package com.kaesar.sword2offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 标题：字符串的排列
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 题目链接：
 * https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&&tqId=11180&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz27 {
  private ArrayList<String> ret = new ArrayList<String>();

  public ArrayList<String> permutation(String str) {
    if (str.length() == 0) {
      return ret;
    }
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    backtracking(chars, new boolean[chars.length], new StringBuilder());
    return ret;
  }

  private void backtracking(char[] chars, boolean[] hasUsed, StringBuilder s) {
    if (s.length() == chars.length) {
      ret.add(s.toString());
      return;
    }
    for (int i = 0; i < chars.length; i++) {
      if (hasUsed[i]) {
        continue;
      }
      // 保证不重复
      if (i != 0 && chars[i] == chars[i - 1] && hasUsed[i - 1]) {
        continue;
      }
      hasUsed[i] = true;
      s.append(chars[i]);
      backtracking(chars, hasUsed, s);
      s.deleteCharAt(s.length() - 1);
      hasUsed[i] = false;
    }
  }

  public static void main(String[] args) {
    Jz27 jz27 = new Jz27();
    ArrayList<String> result = jz27.permutation("abcdee");
    System.out.println("size: " + result.size());
    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i));
    }
  }
}