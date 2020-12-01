package com.kaesar.sword2offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 标题：字符流中第一个不重复的字符
 * 题目描述
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 题目链接：
 * https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720?tpId=13&&tqId=11207&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz54 {

  private int[] cnts = new int[256];
  private Queue<Character> queue = new LinkedList<>();


  //Insert one char from stringstream
  public void insert(char ch) {
    cnts[ch]++;
    queue.add(ch);
    while (!queue.isEmpty() && cnts[queue.peek()] > 1)
      queue.poll();
  }

  //return the first appearence once char in current stringstream
  public char firstAppearingOnce() {
    return queue.isEmpty() ? '#' : queue.peek();
  }
}
