package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_022 {
    /**
     * 暴力破解法
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        List<String> allPossibleResults = new ArrayList<>();
        generateAllPossibleResults(new char[2 * n], 0, allPossibleResults);
        return allPossibleResults;
    }

    public static void generateAllPossibleResults(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAllPossibleResults(current, pos + 1, result);
            current[pos] = ')';
            generateAllPossibleResults(current, pos + 1, result);
        }
    }

    public static boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                ++balance;
            } else {
                --balance;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }

    static List<String> res = new ArrayList<>();

    /**
     * 方法二：回溯法
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis2(int n) {
        if (n <= 0) {
            return res;
        }
        getParenthesis("", n, n);
        return res;
    }

    private static void getParenthesis(String str, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left == right) {
            //剩余左右括号数相等，下一个只能用左括号
            getParenthesis(str + "(", left - 1, right);
        } else if (left < right) {
            //剩余左括号小于右括号，下一个可以用左括号也可以用右括号
            if (left > 0) {
                getParenthesis(str + "(", left - 1, right);
            }
            getParenthesis(str + ")", left, right - 1);
        }
    }

    public static void main(String[] args) {
        List<String> strings = generateParenthesis(4);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("=====================");
        List<String> strings1 = generateParenthesis2(4);
        for (String s : strings1) {
            System.out.println(s);
        }
    }
}