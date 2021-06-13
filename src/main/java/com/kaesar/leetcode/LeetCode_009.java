package com.kaesar.leetcode;

public class LeetCode_009 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String xStr = String.valueOf(x);
        int left = 0, right = xStr.length() - 1;
        while (left <= right) {
            if (xStr.charAt(left) == xStr.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1231321));
    }
}