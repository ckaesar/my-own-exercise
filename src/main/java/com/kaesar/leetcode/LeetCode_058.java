package com.kaesar.leetcode;

public class LeetCode_058 {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (!s.contains(" ")) {
            return s.length();
        }
        int lastIndexOfSpace = s.lastIndexOf(" ");
        return s.substring(lastIndexOfSpace, s.length() - 1).length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
