package com.kaesar.leetcode;

public class LeetCode_125 {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 1) {
            return true;
        }
        int front = 0, end = s.length() - 1;
        while (front <= end) {
            char frontChar = s.charAt(front);
            char endChar = s.charAt(end);
            if ((frontChar >= 'a' && frontChar <= 'z') || (frontChar >= 'A' && frontChar <= 'Z') ||
                    (frontChar >= '0' && frontChar <= '9')) {
                if ((endChar >= 'a' && endChar <= 'z') || (endChar >= 'A' && endChar <= 'Z') ||
                        (endChar >= '0' && endChar <= '9')) {
                    if (Character.isAlphabetic(frontChar)) {
                        frontChar = Character.toUpperCase(frontChar);
                    }
                    if (Character.isAlphabetic(endChar)) {
                        endChar = Character.toUpperCase(endChar);
                    }
                    if (frontChar != endChar) {
                        return false;
                    } else {
                        front++;
                        end--;
                    }
                } else {
                    end--;
                }
            } else {
                front++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
