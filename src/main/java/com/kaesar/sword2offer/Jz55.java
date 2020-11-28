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

  public ListNode EntryNodeOfLoop(ListNode pHead) {
    if (pHead == null || pHead.next == null) {
      return null;
    }
    List<ListNode> nodes = new ArrayList<ListNode>();
    boolean flag = false;
    ListNode node = pHead;
    while (node != null && !flag) {
      if (nodes.contains(node)) {
        flag = true;
        return node;
      } else {
        nodes.add(node);
        node = node.next;
      }
    }
    return null;
  }
}
