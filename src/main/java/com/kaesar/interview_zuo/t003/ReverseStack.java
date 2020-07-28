package com.kaesar.interview_zuo.t003;

import java.util.Stack;

/**
 * 自己的
 */
public class ReverseStack {

  public static Stack reverse(Stack<Integer> stack) {
    if (stack.empty() || stack.size() == 1) {
      return stack;
    } else {
      Stack<Integer> reverseStack = new Stack<Integer>();
      reverseStack.push(stack.pop());
      reverseStack.addAll(reverse(stack));
      return reverseStack;
    }
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < 5; i++) {
      stack.push(i);
    }

    System.out.println("原始的栈");
    for (int item : stack) {
      System.out.print(item + " ");
    }
    System.out.println();
    stack = reverse(stack);

    System.out.println("逆转后的栈");
    for (int item : stack) {
      System.out.print(item + " ");
    }
  }
}
