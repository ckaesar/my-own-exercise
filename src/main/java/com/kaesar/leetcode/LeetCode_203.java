package com.kaesar.leetcode;

public class LeetCode_203 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode firstNode = new ListNode(-1);
        firstNode.next = head;
        ListNode cur = firstNode.next;
        ListNode last = firstNode;
        while (cur != null) {
            if (cur.val == val) {
                last.next = cur.next;
                cur = last.next;
            } else {
                last = cur;
                cur = cur.next;
            }
        }
        return firstNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(6);

        removeElements(head, 6);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
