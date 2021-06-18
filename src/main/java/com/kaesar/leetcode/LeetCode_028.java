package com.kaesar.leetcode;

public class LeetCode_028 {
    /**
     * 暴力破解法
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0 || haystack.length() < needle.length()) {
            return -1;
        }
        int first = 0;
        while (first < haystack.length()) {
            int matchCount = 0;
            for (int i = 0; i < needle.length() && (i + first) < haystack.length(); i++) {
                if (needle.charAt(i) == haystack.charAt(i + first)) {
                    matchCount++;
                } else {
                    break;
                }
            }
            if (matchCount == needle.length()) {
                return first;
            } else {
                first++;
            }
        }
        return -1;
    }

    /**
     * KMP算法：todo
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr2(String haystack, String needle) {
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issi"));
    }
}
