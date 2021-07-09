package com.kaesar.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_141 {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        Set<ListNode> appeared = new HashSet<>();
        while (head != null) {
            if (!appeared.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(hasCycle(head));
    }
}
