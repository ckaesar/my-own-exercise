package com.kaesar.leetcode;

public class LeetCode_172 {
    public static int trailingZeroes(int n) {
        int twoCount = 0, fiveCount = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num % 2 == 0 || num % 5 == 0) {
                if (num % 2 == 0) {
                    twoCount++;
                    num = num / 2;
                }
                if (num % 5 == 0) {
                    fiveCount++;
                    num = num / 5;
                }
            }
        }
        return Math.min(twoCount, fiveCount);
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(5));
    }
}
