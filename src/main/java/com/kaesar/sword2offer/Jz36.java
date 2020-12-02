package com.kaesar.sword2offer;

/**
 * 标题：两个链表的第一个公共结点
 * 题目描述
 * 输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 * 题目链接：
 * https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46?tpId=13&&tqId=11189&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz36 {

  public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    if (pHead1 == null || pHead2 == null) {
      return null;
    }
    ListNode node1 = pHead1;
    while (node1 != null) {
      ListNode node2 = pHead2;
      while (node2 != null) {
        if (node2 == node1) {
          return node1;
        }
        node2 = node2.next;
      }
      node1 = node1.next;
    }
    return null;
  }
}
