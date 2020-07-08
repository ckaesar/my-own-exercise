package com.kaesar.algorithm4.exercise;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdIn;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

public class TestStack {
    public static void main(String[] args) {
        // 创建一个栈并根据StdIn中的指示压入或弹出字符串
        Stack<String> s = new Stack<String>();
        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if(!item.equals("-")) {
                s.push(item);
            } else if(!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }

            StdOut.println("(" + s.size() + " left on stack)");
        }
    }
}
