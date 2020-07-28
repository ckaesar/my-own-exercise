package com.kaesar.test;


import java.util.Stack;

public class Test {

  public static int getLastElement(Stack<Integer> stack) {
    int cur = stack.pop();
    if (stack.isEmpty()) {
      return cur;
    } else {
      int last = getLastElement(stack);
      stack.push(cur);
      return last;
    }
  }

  public static void reverse(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return;
    }
    int lastOne = getLastElement(stack);
    reverse(stack);
    stack.push(lastOne);
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < 5; i++) {
      stack.push(i);
    }

    System.out.println("pre");
    for (int i : stack) {
      System.out.print(i + " ");
    }

    reverse(stack);
    System.out.println("new");
    for (int i : stack) {
      System.out.print(i + " ");
    }
  }
}