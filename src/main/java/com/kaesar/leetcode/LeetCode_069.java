package com.kaesar.leetcode;

public class LeetCode_069 {
    public static int mySqrt(int x) {
        int min = 0, max = 46340, mid = 1, result = 0;
        mid = (min + max) / 2;
        while (min <= max) {
            int temp = mid * mid;
            if (temp == x) {
                return mid;
            } else if (temp < x) {
                min = mid + 1;
                result = mid;
            } else {
                result = mid - 1;
                max = mid - 1;
            }
            mid = (min + max) / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }
}
