package com.kaesar.interview_zuo.t001;

import java.util.Scanner;
import java.util.Stack;

/**
 * 自己的
 */
public class MyStack {
  private Stack<Integer> datas = new Stack<Integer>();
  private Stack<Integer> minDatas = new Stack<Integer>();

  public int pop() {
    if (datas != null && datas.size() > 0) {
      int data = datas.pop();
      if (minDatas.peek() == data) {
        minDatas.pop();
      }
      return data;
    } else {
      throw new RuntimeException("栈为空，没有数据");
    }
  }

  public void push(int data) {
    if (minDatas == null || minDatas.size() == 0) {
      minDatas.push(data);
    } else {
      int minData = minDatas.peek();
      if (data <= minData) {
        minDatas.push(data);
      }
    }

    datas.push(data);
  }

  public int getMin() {
    if (minDatas != null && minDatas.size() > 0) {
      return minDatas.peek();
    } else {
      throw new RuntimeException("栈为空，没有数据，所以没有最小元素");
    }
  }

  public static void main(String[] args) {
    MyStack myStack = new MyStack();
    System.out.println("请输入: 0(输入) 1(输出) 2(查看最小值) 3(退出)");
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    while (flag) {
      int i = scanner.nextInt();
      switch (i) {
        case 0:
          int in = scanner.nextInt();
          myStack.push(in);
          break;
        case 1:
          int data = myStack.pop();
          System.out.println(data);
          break;
        case 2:
          int minData = myStack.getMin();
          System.out.println(minData);
          break;
        case 3:
          flag = false;
          break;
      }
    }
  }

}