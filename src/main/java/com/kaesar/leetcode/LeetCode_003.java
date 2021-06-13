package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_003 {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int count = 0;
        int charAt = 0;
        List<Character> charList = new ArrayList<Character>(s.length());
        for (int i = 0; i < s.length(); i++) {
            List<Character> subList = charList.subList(charAt, i);
            if (subList.contains(s.charAt(i))) {
                charAt = charList.lastIndexOf(s.charAt(i)) + 1;
            }
            if (i + 1 - charAt > count) {
                count = i + 1 - charAt;
            }
            charList.add(s.charAt(i));
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}