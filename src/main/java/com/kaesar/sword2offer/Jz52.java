package com.kaesar.sword2offer;

/**
 * 标题：正则表达式匹配
 * 题目描述
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * 题目链接：
 * https://www.nowcoder.com/practice/45327ae22b7b413ea21df13ee7d6429c?tpId=13&&tqId=11205&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz52 {

  public boolean match(char[] str, char[] pattern) {
    int m = str.length, n = pattern.length;
    boolean[][] dp = new boolean[m + 1][n + 1];

    dp[0][0] = true;
    for (int i = 1; i <= n; i++) {
      if (pattern[i - 1] == '*') {
        dp[0][i] = dp[0][i - 2];
      }
    }

    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.') {
          dp[i][j] = dp[i - 1][j - 1];
        } else if (pattern[j - 1] == '*') {
          if (pattern[j - 2] == str[i - 1] || pattern[j - 2] == '.') {
            dp[i][j] |= dp[i][j - 1];
            dp[i][j] |= dp[i - 1][j];
            dp[i][j] |= dp[i][j - 2];
          } else {
            dp[i][j] = dp[i][j - 2];
          }
        }
      }
    }

    return dp[m][n];
  }

  public static void main(String[] args) {
    Jz52 jz52 = new Jz52();
    System.out.println(jz52.match("aaa".toCharArray(), "a*a".toCharArray()));
  }
}