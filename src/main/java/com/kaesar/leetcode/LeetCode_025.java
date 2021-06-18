package com.kaesar.leetcode;

import java.util.Stack;

public class LeetCode_025 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) {
            return head;
        }

        ListNode newHead;
        ListNode pre = new ListNode(-1);
        newHead = pre;
        pre.next = head;
        int count = 0;
        ListNode next = head;
        Stack<ListNode> kListNode = new Stack<>();
        while (next != null || count == k) {
            if (count == k) {
                while (!kListNode.isEmpty()) {
                    pre.next = kListNode.pop();
                    pre = pre.next;
                }
                pre.next = next;
                count = 0;
            } else {
                if (next != null) {
                    kListNode.push(next);
                    next = next.next;
                    count++;
                }
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseKGroup(head, 3);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
