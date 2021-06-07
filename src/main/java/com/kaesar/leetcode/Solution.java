package com.kaesar.leetcode;

public class Solution {
    /**
     * 解法一：暴力破解法
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        String result = String.valueOf(s.charAt(0));
        int max = 1;
        StringBuilder sb;
        for (int i = 0; i < s.length() - 1; i++) {
            sb = new StringBuilder(String.valueOf(s.charAt(i)));
            for (int j = i + 1; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if (checkPalindrome(sb.toString())) {
                    if (sb.length() > max) {
                        result = sb.toString();
                        max = sb.length();
                    }
                }
            }
        }
        return result;
    }

    /**
     * 解法二：动态规划
     *
     * @param s
     * @return
     */
    public static String longestPalindrome2(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        String result = String.valueOf(s.charAt(0));
        int max = 1;
        StringBuilder sb;
        for (int i = 0; i < s.length() - 1; i++) {
            sb = new StringBuilder(String.valueOf(s.charAt(i)));
            for (int j = i + 1; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if (checkPalindrome(sb.toString())) {
                    if (sb.length() > max) {
                        result = sb.toString();
                        max = sb.length();
                    }
                }
            }
        }
        return result;
    }

    public static boolean checkPalindrome(String str) {
        if (str == null || str.length() == 1) {
            return true;
        }
        if (str.length() == 2 && str.charAt(0) == str.charAt(1)) {
            return true;
        }
        int count = str.length();
        for (int i = 0; i < count; i++) {
            if (str.charAt(i) != str.charAt(count - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"));
    }
}

