package com.kaesar.leetcode;

public class LeetCode_007 {
    public static int reverse(int x) {
        if (x == 0 || x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return 0;
        }
        String xStr = String.valueOf(x);
        String symbol = "";
        if (x < 0) {
            symbol = "-";
            xStr = xStr.substring(1);
        }
        String result = "";
        int zeroCount = 0;
        for (int i = xStr.length() - 1; i >= 0; i--) {
            if (xStr.charAt(i) != '0') {
                break;
            } else {
                zeroCount++;
            }
        }
        for (int i = xStr.length() - 1 - zeroCount; i >= 0; i--) {
            result += xStr.charAt(i);
        }
        double doubleResult = Double.valueOf(symbol + result);
        if (doubleResult < Integer.MIN_VALUE || doubleResult > Integer.MAX_VALUE) {
            return 0;
        }
        return Integer.valueOf(symbol + result);
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}