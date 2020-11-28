package com.kaesar.interview_zuo.t005;

import java.util.SortedMap;
import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序
 * 自己的
 */
public class StackSort {

  public static void sort(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return;
    }
    Stack<Integer> sortedStack = new Stack<Integer>();
    int temp;
    int count;
    sortedStack.push(stack.pop());
    while (!stack.isEmpty()) {
      count = 0;
      temp = stack.pop();
      while (!sortedStack.isEmpty() && sortedStack.peek() < temp) {
        count++;
        stack.push(sortedStack.pop());
      }
      sortedStack.push(temp);
      for (int i = 0; i < count; i++) {
        sortedStack.push(stack.pop());
      }
    }

    while (!sortedStack.isEmpty()) {
      stack.push(sortedStack.pop());
    }
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(4);
    stack.push(5);
    stack.push(2);

    System.out.println("排序前");
    System.out.println("栈顶" + stack.peek());
    for (int item : stack) {
      System.out.print(item + " ");
    }
    System.out.println();

    sort(stack);
    System.out.println("排序后");
    System.out.println("栈顶" + stack.peek());
    for (int item : stack) {
      System.out.print(item + " ");
    }
  }
}
