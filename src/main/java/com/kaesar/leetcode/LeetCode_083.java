package com.kaesar.leetcode;

public class LeetCode_083 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next, cur = head;
        int curVal = head.val;
        while (next != null) {
            if (next.val == curVal) {
                next = next.next;
                cur.next = null;
            } else {
                cur.next = next;
                cur = cur.next;
                curVal = next.val;
                next = next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(1);
        root.next.next = new ListNode(2);
        root.next.next.next = new ListNode(3);
        root.next.next.next.next = new ListNode(3);
        System.out.println("=====处理前=====");
        ListNode temp = root;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

        deleteDuplicates(root);
        System.out.println("=====处理后=====");
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
    }
}
