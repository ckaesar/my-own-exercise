package com.kaesar.leetcode;

public class LeetCode_023 {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        int count = 0;
        ListNode result = new ListNode(-1);
        ListNode next = result;
        do {
            count = 0;
            int min = Integer.MAX_VALUE, minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    count++;
                    if (min > lists[i].val) {
                        min = lists[i].val;
                        minIndex = i;
                    }
                }
            }
            if (count > 0) {
                next.next = new ListNode(min);
                lists[minIndex] = lists[minIndex].next;
                next = next.next;
            }
        } while (count > 0);
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode result = mergeKLists(new ListNode[]{l1, l2, l3});
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
