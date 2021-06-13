package com.kaesar.leetcode;

public class LeetCode_014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0] == null || strs[0].length() == 0) {
            return "";
        }
        char[] chars = strs[0].toCharArray();
        int maxIndex = strs[0].length() - 1;
        for (int i = 1; i < strs.length && maxIndex >= 0; i++) {
            String curStr = strs[i];
            if (curStr == null || curStr.length() == 0) {
                return "";
            }
            int curMax = maxIndex;
            for (int j = 0; j < curStr.length() && j <= curMax && maxIndex >= 0; j++) {
                if (curStr.charAt(j) != chars[j]) {
                    maxIndex = j - 1;
                    break;
                } else {
                    maxIndex = j;
                }
            }
        }
        if (maxIndex < 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= maxIndex; i++) {
            result.append(chars[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
    }
}