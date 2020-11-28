package com.kaesar.sword2offer;

import java.util.Stack;

/**
 * 标题：包含 min 函数的栈
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 题目链接：
 * https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&&tqId=11173&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz20 {

  private Stack<Integer> datas = new Stack<Integer>();
  private Stack<Integer> minDatas = new Stack<Integer>();

  public void push(int node) {
    datas.push(node);
    if (minDatas.isEmpty()) {
      minDatas.push(node);
    } else if (node <= minDatas.peek()) {
      minDatas.push(node);
    }
  }

  public void pop() {
    int popData = datas.pop();
    if (popData == minDatas.peek()) {
      minDatas.pop();
    }
  }

  public int top() {
    return datas.peek();
  }

  public int min() {
    return minDatas.peek();
  }
}
