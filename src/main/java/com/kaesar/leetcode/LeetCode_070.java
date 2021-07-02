package com.kaesar.leetcode;

public class LeetCode_070 {
    /**
     * 递归：提交时超出时间限制了
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * 迭代
     *
     * @param n
     * @return
     */
    public static int climbStairs2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int lastOne = 1, lastTwo = 2, result = -1;
        for (int i = 3; i <= n; i++) {
            result = lastOne + lastTwo;
            lastOne = lastTwo;
            lastTwo = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
        System.out.println(climbStairs2(45));
    }
}
