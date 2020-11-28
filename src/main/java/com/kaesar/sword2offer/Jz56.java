package com.kaesar.sword2offer;

/**
 * 标题：删除链表中重复的结点
 * 题目描述
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * 题目链接：
 * https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef?tpId=13&&tqId=11209&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz56 {

  public ListNode deleteDuplication(ListNode pHead) {
    if (pHead == null || pHead.next == null) {
      return pHead;
    }
    ListNode next = pHead.next;
    if (pHead.val == next.val) {
      while (next != null && pHead.val == next.val) {
        next = next.next;
      }
      return deleteDuplication(next);
    } else {
      pHead.next = deleteDuplication(pHead.next);
      return pHead;
    }
  }

  public static void main(String[] args) {
    ListNode pHead = new ListNode(1);
    pHead.next = new ListNode(1);
    pHead.next.next = new ListNode(1);
    pHead.next.next.next = new ListNode(1);
    pHead.next.next.next.next = new ListNode(1);
    pHead.next.next.next.next.next = new ListNode(1);
    pHead.next.next.next.next.next.next = new ListNode(1);

    Jz56 jz56 = new Jz56();
    ListNode listNode = jz56.deleteDuplication(pHead);
    System.out.println(listNode);
  }
}
