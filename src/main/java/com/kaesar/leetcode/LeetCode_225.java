package com.kaesar.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top()); // 返回 2
        System.out.println(myStack.pop()); // 返回 2
        System.out.println(myStack.empty()); // 返回 False
    }
}

class MyStack {
    private Queue<Integer> firstQueue;
    private Queue<Integer> secondQueue;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        firstQueue = new LinkedList<>();
        secondQueue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (firstQueue == null) {
            secondQueue.add(x);
        } else {
            firstQueue.add(x);
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (this.empty()) {
            throw new RuntimeException("empty stack.");
        }
        if (firstQueue.isEmpty()) {
            int size = secondQueue.size();
            for (int i = 1; i < size; i++) {
                firstQueue.add(secondQueue.poll());
            }
            return secondQueue.poll();
        } else {
            int size = firstQueue.size();
            for (int i = 1; i < size; i++) {
                secondQueue.add(firstQueue.poll());
            }
            return firstQueue.poll();
        }
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (this.empty()) {
            throw new RuntimeException("empty stack.");
        }
        int result = -1;
        if (firstQueue.isEmpty()) {
            int size = secondQueue.size();
            for (int i = 1; i < size; i++) {
                firstQueue.add(secondQueue.poll());
            }
            result = secondQueue.peek();
            firstQueue.add(secondQueue.poll());
        } else {
            int size = firstQueue.size();
            for (int i = 1; i < size; i++) {
                secondQueue.add(firstQueue.poll());
            }
            result = firstQueue.peek();
            secondQueue.add(firstQueue.poll());
        }
        return result;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return firstQueue.isEmpty() && secondQueue.isEmpty();
    }
}
