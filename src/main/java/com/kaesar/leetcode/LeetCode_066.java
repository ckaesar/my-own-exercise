package com.kaesar.leetcode;

import java.util.Arrays;

public class LeetCode_066 {
    public static int[] plusOne(int[] digits) {
        int addOne = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (addOne + digits[i] == 10) {
                addOne = 1;
                digits[i] = 0;
            } else {
                digits[i] = addOne + digits[i];
                addOne = 0;
            }
        }
        if (addOne == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = addOne;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = new int[]{4, 3, 2, 1};
        Arrays.stream(plusOne(digits)).forEach(digit -> {
            System.out.print(digit + " ");
        });
    }
}
