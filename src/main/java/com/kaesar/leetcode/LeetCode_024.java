package com.kaesar.leetcode;

public class LeetCode_024 {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        ListNode pre = new ListNode(-1), first = head, second;
        pre.next = head;
        while (first != null && first.next != null) {
            second = first.next;

            first.next = second.next;
            second.next = first;
            pre.next = second;

            pre = first;
            first = first.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = swapPairs(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
