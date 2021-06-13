package com.kaesar.leetcode;

public class LeetCode_006 {
    public static String convert(String s, int numRows) {
        if (s == null || s.length() < 3 || numRows == 1) {
            return s;
        }
        char[][] chars = new char[numRows][s.length()];
        boolean[][] flags = new boolean[numRows][s.length()];

        int x = -1, y = 0, count = 0;
        while (count < s.length()) {
            while (x < numRows && count < s.length()) {
                if (x + 1 < numRows) {
                    x++;
                    chars[x][y] = s.charAt(count);
                    flags[x][y] = true;
                    count++;
                } else {
                    break;
                }
            }
            while (x >= 0 && count < s.length()) {
                if (x - 1 >= 0) {
                    x--;
                    y++;
                    chars[x][y] = s.charAt(count);
                    flags[x][y] = true;
                    count++;
                } else {
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (flags[i][j]) {
                    sb.append(String.valueOf(chars[i][j]));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("ABC", 1));
    }
}