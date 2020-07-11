package com.kaesar.algorithm4.exercise;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.Stack;

/**
 * 习题 1.3.9
 * 编写一段程序，从标准输入得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式。
 * 例如，给定输入：
 * 1+2)*3-4)*5-6)))
 * 你的程序应该输出：
 * ((1+2)*((3-4)*(5-6)))
 */
public class FillLeftParentheses {

    public static String fill(String expression) {
        Stack<String> ops = new Stack<String>(); // 操作符栈
        Stack<String> vals = new Stack<String>(); // 操作数栈
        for (char c : expression.toCharArray()) {
            String cStr = String.valueOf(c);
            if (cStr.equals("+") || cStr.equals("-") || cStr.equals("*") || cStr.equals("/")) {
                ops.push(cStr);
            } else if (cStr.equals(")")) {
                String firstString = vals.pop();
                String secondString = vals.pop();
                String newString = "(" + secondString + ops.pop() + firstString + ")";
                vals.push(newString);
            } else {
                vals.push(cStr);
            }
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        String expression = "1+2)*3-4)*5-6)))";
        System.out.println(fill(expression));
    }
}
