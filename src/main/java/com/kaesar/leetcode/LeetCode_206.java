package com.kaesar.leetcode;

public class LeetCode_206 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reverseList(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
