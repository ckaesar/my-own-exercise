package com.kaesar.leetcode;

public class LeetCode_231 {
    public static boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        }
        int minPower = 0, maxPower = 30, mid;
        while (minPower <= maxPower) {
            mid = (minPower + maxPower) / 2;
            if (n == Math.pow(2, mid)) {
                return true;
            } else if (n < Math.pow(2, mid)) {
                maxPower = mid - 1;
            } else {
                minPower = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
