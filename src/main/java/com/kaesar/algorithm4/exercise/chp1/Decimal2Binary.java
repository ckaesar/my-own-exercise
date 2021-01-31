package com.kaesar.algorithm4.exercise.chp1;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.Stack;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

/**
 * 十进制转为二进制并打印出来
 */
public class Decimal2Binary {

    public static void transfer(int N) {
        Stack<Integer> stack = new Stack<Integer>();
        while(N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        for(int d: stack) {
            StdOut.print(d);
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        transfer(50);
    }
}
