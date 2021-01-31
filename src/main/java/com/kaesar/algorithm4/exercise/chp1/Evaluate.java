package com.kaesar.algorithm4.exercise.chp1;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * 简易计算器：栈
 */
public class Evaluate {

    public static double evaluate(String expression) {
        if (expression == null || expression.length() == 0) {
            return Double.MIN_VALUE;
        }

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        for (char c : expression.toCharArray()) {
            String s = String.valueOf(c);
            // 读取字符， 如果是运算符则压入栈
            if ("(".equals(s)) {

            } else if ("+".equals(s)) {
                ops.push(s);
            } else if ("-".equals(s)) {
                ops.push(s);
            } else if ("*".equals(s)) {
                ops.push(s);
            } else if ("/".equals(s)) {
                ops.push(s);
            } else if ("sqrt".equals(s)) {
                ops.push(s);
            } else if (")".equals(s)) {
                // 如果字符为 ")"，弹出运算符和操作数，计算结果并压入栈
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                // 如果字符既非运算符也不是括号，将它作为double值压入栈
                vals.push(Double.parseDouble(s));
            }
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        String expression = "(1+((2+3)*(4*5)))";
        StdOut.println(evaluate(expression));
    }
}

