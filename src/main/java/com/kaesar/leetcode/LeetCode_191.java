package com.kaesar.leetcode;

public class LeetCode_191 {
    public static int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        int result = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(20));
    }
}
