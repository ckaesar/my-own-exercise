package com.kaesar.algorithm4.exercise.chp1;

public class NodeTest {

  public static void main(String[] args) {
    Node first = new Node();
    Node second = new Node();
    Node third = new Node();

    first.item = "to";
    second.item = "be";
    third.item = "or";

    first.next = second;
    second.next = third;

    // 在链表头部添加元素
    Node oldfirst = first;
    first = new Node();
    first.item = "not";
    first.next = oldfirst;

    // 删除链表头部元素
    first = first.next;

    // 在链表尾部添加元素
    Node oldlast = third;
    third = new Node();
    third.item = "not";
    oldlast.next = third;

    // 遍历链表元素
    for (Node x = first; x != null; x = x.next) {
      // 处理过程
    }
  }
}
