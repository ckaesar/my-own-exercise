package com.kaesar.leetcode;

public class LeetCode_038 {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String last = "1", cur = "";
        char curNum;
        int curNumCount = 0;
        for (int i = 2; i <= n; i++) {
            cur = "";
            curNum = last.charAt(0);
            curNumCount = 1;
            for (int x = 1; x < last.length(); x++) {
                if (last.charAt(x) == curNum) {
                    curNumCount++;
                } else {
                    cur += curNumCount + "" + curNum;
                    curNum = last.charAt(x);
                    curNumCount = 1;
                }
            }
            cur += curNumCount + "" + curNum;
            last = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
