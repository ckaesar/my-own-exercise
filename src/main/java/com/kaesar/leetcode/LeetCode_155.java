package com.kaesar.leetcode;

import java.util.Stack;

public class LeetCode_155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   // 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());      // 返回 0.
        System.out.println(minStack.getMin());   // 返回 -2.
    }
}

class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> minVal;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        data = new Stack<>();
        minVal = new Stack<>();
    }

    public void push(int val) {
        data.push(val);
        if (minVal.isEmpty()) {
            minVal.push(val);
        } else if (val <= minVal.peek()) {
            minVal.push(val);
        }
    }

    public void pop() {
        if (data.isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }
        int popVal = data.pop();
        if (popVal == minVal.peek()) {
            minVal.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        if (minVal.isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }
        return minVal.peek();
    }
}
