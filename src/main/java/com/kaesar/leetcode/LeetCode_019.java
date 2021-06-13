package com.kaesar.leetcode;

import java.util.Stack;

public class LeetCode_019 {
    /**
     * 方法一：利用栈
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        Stack<Integer> temp = new Stack<>();
        while (head != null) {
            temp.push(head.val);
            head = head.next;
        }
        Stack<Integer> result = new Stack<>();
        int count = 1;
        boolean findN = false;
        while (!temp.isEmpty()) {
            if (count == n) {
                temp.pop();
                findN = true;
                count++;
                continue;
            }
            result.push(temp.pop());
            count++;
        }
        if (!findN) {
            return null;
        }
        ListNode resultNode = new ListNode(-1);
        ListNode next = resultNode;
        while (!result.isEmpty()) {
            next.next = new ListNode(result.pop());
            next = next.next;
        }
        return resultNode.next;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root = removeNthFromEnd(root, 2);
        while (root != null) {
            System.out.print(root.val + "->");
            root = root.next;
        }
    }
}