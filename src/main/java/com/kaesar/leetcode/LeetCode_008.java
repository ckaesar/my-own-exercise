package com.kaesar.leetcode;

public class LeetCode_008 {
    public static int myAtoi(String s) {
        if (s == null) {
            return 0;
        }
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        String result = "";
        String symbol = "";
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            symbol = String.valueOf(s.charAt(0));
            s = s.substring(1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                result += String.valueOf(s.charAt(i));
            } else {
                break;
            }
        }
        if (result == "") {
            return 0;
        }
        double doubleResult = Double.valueOf(symbol + result);
        if (doubleResult < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (doubleResult > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return Integer.valueOf(symbol + result);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" "));
    }
}