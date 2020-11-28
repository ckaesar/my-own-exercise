package com.kaesar.sword2offer;

import java.util.Arrays;

/**
 * 标题：变态跳台阶
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 题目链接
 * https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&&tqId=11162&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz09 {

  /**
   * 动态规划
   *
   * @param target
   * @return
   */
  public int jumpFloorII(int target) {
    int[] dp = new int[target];
//    Arrays.fill(dp, 1);
    for(int i = 0; i < target; i++) {
      dp[i] = 1;
    }
    for (int i = 1; i < target; i++) {
      for (int j = 0; j < i; j++) {
        dp[i] += dp[j];
      }
    }
    return dp[target - 1];
  }

  public static void main(String[] args) {
    Jz09 jz09 = new Jz09();
    System.out.println(jz09.jumpFloorII(10));
//    for (int i = 1; i < 10; i++) {
//      System.out.print(jz09.jumpFloorII(i) + " ");
//    }
  }
}
