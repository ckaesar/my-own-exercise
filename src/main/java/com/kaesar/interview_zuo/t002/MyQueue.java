package com.kaesar.interview_zuo.t002;

import java.util.Scanner;
import java.util.Stack;

/**
 * 自己的
 */
public class MyQueue {
  private Stack<Integer> stack1;
  private Stack<Integer> stack2;

  public MyQueue() {
    this.stack1 = new Stack<Integer>();
    this.stack2 = new Stack<Integer>();
  }

  public void add(int data) {
    if (stack1.isEmpty()) {
      stack1.push(data);
    } else {
      int stack1Size = stack1.size();
      for (int i = 0; i < stack1Size; i++) {
        stack2.push(stack1.pop());
      }
      stack1.push(data);

      int stack2Size = stack2.size();
      for (int i = 0; i < stack2Size; i++) {
        stack1.push(stack2.pop());
      }
    }
  }

  public int poll() {
    if (stack1.isEmpty()) {
      throw new RuntimeException("队列为空");
    }
    return stack1.pop();
  }

  public int peek() {
    if (stack1.isEmpty()) {
      throw new RuntimeException("队列为空");
    }
    return stack1.peek();
  }

  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    System.out.println("请输入: 0(输入) 1(输出) 2(查看队列头部数据) 3(退出)");
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    while (flag) {
      int i = scanner.nextInt();
      switch (i) {
        case 0:
          int in = scanner.nextInt();
          myQueue.add(in);
          break;
        case 1:
          int data = myQueue.poll();
          System.out.println(data);
          break;
        case 2:
          int peekData = myQueue.peek();
          System.out.println(peekData);
          break;
        case 3:
          flag = false;
          break;
      }
    }
  }
}