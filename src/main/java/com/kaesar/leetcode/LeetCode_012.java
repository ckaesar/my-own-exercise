package com.kaesar.leetcode;

public class LeetCode_012 {
    public static String intToRoman(int num) {
        // 所有可能的取值
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // 对应的罗马数字表示
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < values.length && num > 0; i++) {
            int value = values[i];
            String roman = romans[i];
            while (num >= value) {
                num -= value;
                result.append(roman);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}