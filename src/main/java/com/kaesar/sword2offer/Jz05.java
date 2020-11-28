package com.kaesar.sword2offer;

import java.util.Stack;

/**
 * 标题：用两个栈实现队列
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 题目链接
 * https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&&tqId=11158&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz05 {

  Stack<Integer> stack1 = new Stack<Integer>();
  Stack<Integer> stack2 = new Stack<Integer>();

  public void push(int node) {
    stack1.push(node);
  }

  public int pop() {
    if (stack2.size() == 0 && stack1.size() == 0) {
      throw new RuntimeException("该队列为空");
    }
    if (stack2.size() == 0) {
      while (stack1.size() > 0) {
        stack2.push(stack1.pop());
      }
    }
    return stack2.pop();
  }
}
