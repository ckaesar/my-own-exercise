package com.kaesar.leetcode;

public class LeetCode_067 {
    public static String addBinary(String a, String b) {
        int addOne = 0;
        String result = "";
        while (a.length() > 30 || b.length() > 30) {
            String aStr;
            String bStr;
            if (a.length() > 30) {
                aStr = a.substring(a.length() - 30, a.length());
                a = a.substring(0, a.length() - 30);
            } else {
                aStr = a;
                a = "0";
            }
            if (b.length() > 30) {
                bStr = b.substring(b.length() - 30, b.length());
                b = b.substring(0, b.length() - 30);
            } else {
                bStr = b;
                b = "0";
            }
            String temp = Integer.toBinaryString(Integer.parseInt(aStr, 2) + Integer.parseInt(bStr, 2) + addOne);
            if (temp.length() > 30) {
                addOne = 1;
                temp = temp.substring(1, temp.length());
            } else {
                if(temp.length() < 30) {
                    int zeroCount = 30 - temp.length();
                    for(int i = 0; i < zeroCount; i++) {
                        temp = "0" + temp;
                    }
                }
                addOne = 0;
            }
            result = temp + result;
        }
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2) + addOne) + result;
    }

    public static void main(String[] args) {
        String a = "1001101011011010000010111010100111001000100001111110011111001010100101111";
        String b = "111000011000010000001100001001010011000101000000001111101101000100000000100100001100010000111001000";
        System.out.println(addBinary(a, b));
    }
}

