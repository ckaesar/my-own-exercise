package com.kaesar.sword2offer;

/**
 * 标题：合并两个排序的链表
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 题目链接：
 * https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&&tqId=11169&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz16 {

  public ListNode merge(ListNode list1, ListNode list2) {
    if (list1 == null && list2 == null) {
      return null;
    }
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }
    ListNode result = new ListNode(-1);
    ListNode next = result;
    while (list1 != null || list2 != null) {
      if (list1 == null) {
        next.next = list2;
        break;
      } else if (list2 == null) {
        next.next = list1;
        break;
      } else if (list1.val < list2.val) {
        next.next = list1;
        list1 = list1.next;
      } else {
        next.next = list2;
        list2 = list2.next;
      }
      next = next.next;
    }

    return result.next;
  }

  public static void main(String[] args) {
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(3);
    list1.next.next = new ListNode(5);

    ListNode list2 = new ListNode(2);
    list2.next = new ListNode(4);
    list2.next.next = new ListNode(6);

    System.out.println("after merge");
    Jz16 jz16 = new Jz16();
    ListNode result = jz16.merge(list1, list2);
    ListNode cur = result;
    while (cur != null) {
      System.out.print(cur.val + " ");
      cur = cur.next;
    }
  }
}

