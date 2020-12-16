package com.kaesar.sword2offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 标题：链表中环的入口结点
 * 题目描述
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * 题目链接：
 * https://www.nowcoder.com/practice/253d2c59ec3e4bc68da16833f79a38e4?tpId=13&&tqId=11208&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz55 {

  public ListNode entryNodeOfLoop(ListNode pHead) {
    if (pHead == null || pHead.next == null) {
      return null;
    }
    List<ListNode> nodes = new ArrayList<ListNode>();
    ListNode node = pHead;
    while (node != null) {
      if (nodes.contains(node)) {
        return node;
      } else {
        nodes.add(node);
        node = node.next;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    ListNode root = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(4);
    ListNode node4 = new ListNode(5);

    root.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node2;

    Jz55 jz55 = new Jz55();
    ListNode result = jz55.entryNodeOfLoop(root);
    System.out.println(result);
  }
}
