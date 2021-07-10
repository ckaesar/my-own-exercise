package com.kaesar.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> notRepeatNodes = new HashSet<>();
        ListNode nextA = headA;
        ListNode nextB = headB;
        while (nextA != null || nextB != null) {
            if (nextA != null) {
                if (!notRepeatNodes.add(nextA)) {
                    return nextA;
                } else {
                    nextA = nextA.next;
                }
            }
            if (nextB != null) {
                if (!notRepeatNodes.add(nextB)) {
                    return nextB;
                } else {
                    nextB = nextB.next;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);

        ListNode headB = new ListNode(3);

        ListNode commonNode = new ListNode(2);

        headA.next.next.next = commonNode;
        headB.next = commonNode;
        commonNode.next = new ListNode(4);

        ListNode result = getIntersectionNode(headA, headB);
        if (result == null) {
            System.out.println("不相交");
        } else {
            System.out.println(result.val);
        }
    }
}
