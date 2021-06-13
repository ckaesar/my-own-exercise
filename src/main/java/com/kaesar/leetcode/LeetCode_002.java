package com.kaesar.leetcode;

public class LeetCode_002 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int addOne = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            sum += addOne;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            addOne = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        if (addOne > 0) {
            cur.next = new ListNode(addOne);
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.println("result:");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}