package com.kaesar.leetcode;

public class LeetCode_021 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(-1);
        ListNode next = result;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                next.next = l2;
                break;
            }
            if (l2 == null) {
                next.next = l1;
                break;
            }
            if (l1.val > l2.val) {
                next.next = new ListNode(l2.val);
                l2 = l2.next;
                next = next.next;
                continue;
            } else {
                next.next = new ListNode(l1.val);
                l1 = l1.next;
                next = next.next;
                continue;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
