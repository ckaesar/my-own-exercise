package com.kaesar.leetcode;

public class LeetCode_206 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head, second = head.next;
        first.next = null;
        while (first != null && second != null) {
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        return first;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = reverseList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
