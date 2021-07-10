package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_168 {
    public static Map<Integer, Character> mappings = new HashMap<>();

    static {
        for (int i = 1; i <= 26; i++) {
            mappings.put(i, Character.valueOf((char) ('A' - 1 + i)));
        }
    }

    public static String convertToTitle(int columnNumber) {
        List<Integer> nums = new ArrayList<>();
        while (columnNumber > 26) {
            nums.add(0, columnNumber % 26);
            columnNumber = columnNumber / 26;
        }
        nums.add(0, columnNumber);
        String result = "";
        for (Integer num : nums) {
            result += mappings.get(num);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }
}