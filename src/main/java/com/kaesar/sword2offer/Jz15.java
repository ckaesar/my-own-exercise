package com.kaesar.sword2offer;

/**
 * 标题：反转链表
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 题目链接：
 * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&&tqId=11168&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz15 {

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode first = head, second = head.next;
    first.next = null;
    while (first != null && second != null) {
      ListNode temp = first;
      first = second;
      second = second.next;
      first.next = temp;
    }
    return first;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    System.out.println("before reverse");
    ListNode cur = head;
    while (cur != null) {
      System.out.print(cur.val + " ");
      cur = cur.next;
    }
    System.out.println();
    Jz15 jz15 = new Jz15();
    ListNode result = jz15.reverseList(head);
    System.out.println("after reverse");
    ListNode cur1 = result;
    while (cur1 != null) {
      System.out.print(cur1.val + " ");
      cur1 = cur1.next;
    }
  }
}


