package com.kaesar.leetcode;

import java.util.Stack;

public class LeetCode_020 {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> leftParentheses = new Stack<>();
        for (char parentheses : s.toCharArray()) {
            if (parentheses == '(' || parentheses == '{' || parentheses == '[') {
                leftParentheses.push(parentheses);
            } else if (parentheses == ')') {
                if (leftParentheses.size() > 0 && leftParentheses.peek() == '(') {
                    leftParentheses.pop();
                } else {
                    return false;
                }
            } else if (parentheses == ']') {
                if (leftParentheses.size() > 0 && leftParentheses.peek() == '[') {
                    leftParentheses.pop();
                } else {
                    return false;
                }
            } else if (parentheses == '}') {
                if (leftParentheses.size() > 0 && leftParentheses.peek() == '{') {
                    leftParentheses.pop();
                } else {
                    return false;
                }
            }
        }
        if (leftParentheses.size() != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}