package com.kaesar.interview_zuo.t003;

import java.util.Stack;

/**
 * 递归方法逆转一个栈
 */
public class ReverseStackRecursion {

  public static int getAndRemoveLastElement(Stack<Integer> stack) {
    int result = stack.pop();
    if (stack.isEmpty()) {
      return result;
    } else {
      int last = getAndRemoveLastElement(stack);
      stack.push(result);
      return last;
    }
  }

  public static void reverse(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return;
    }
    int i = getAndRemoveLastElement(stack);
    reverse(stack);
    stack.push(i);
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < 5; i++) {
      stack.push(i);
    }

    System.out.println("原始的栈元素");
    for (int item : stack) {
      System.out.print(item + " ");
    }
    System.out.println();
    reverse(stack);

    System.out.println("逆转后的栈元素");
    for (int item : stack) {
      System.out.print(item + " ");
    }
  }
}
