package com.kaesar.leetcode;

public class LeetCode_013 {

    public static int romanToInt(String s) {
        // 所有可能的取值
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // 对应的罗马数字表示
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int result = 0;
        for (int i = 0; i < romans.length && s.length() > 0; i++) {
            String roman = romans[i];
            int value = values[i];
            while (s.startsWith(roman)) {
                s = s.substring(roman.length());
                result += value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}