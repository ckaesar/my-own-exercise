package com.kaesar.sword2offer;

/**
 * 标题：跳台阶
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 * 题目链接：
 * https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&&tqId=11161&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz08 {

  public int jjumpFloor(int target) {
    if (target <= 2) {
      return target;
    }
    int last1 = 1, last2 = 2, result = last1 + last2;
    for (int i = 3; i <= target; i++) {
      result = last1 + last2;
      last1 = last2;
      last2 = result;
    }
    return result;
  }

  public static void main(String[] args) {
    Jz08 jz08 = new Jz08();
    for (int i = 1; i < 10; i++) {
      System.out.println(jz08.jjumpFloor(i));
    }
  }
}
