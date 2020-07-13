package com.kaesar.sword2offer;

import java.util.ArrayList;

/**
 * 标题：从尾到头打印链表
 * 题目描述
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 * 题目链接
 * https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Jz03 {
    /**
     * 非递归
     *
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (; listNode != null; listNode = listNode.next) {
            res.add(0, listNode.val);
        }
        return res;
    }

    /**
     * 递归
     *
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (listNode != null) {
            res.addAll(printListFromTailToHead1(listNode.next));
            res.add(listNode.val);
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(67);
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(24);
        ListNode node3 = new ListNode(58);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;

        // 非递归
        System.out.println("非递归~~~");
        ArrayList<Integer> res = printListFromTailToHead(node);
        for (int val : res) {
            System.out.println(val);
        }

        // 递归
        System.out.println("递归~~~");
        ArrayList<Integer> res1 = printListFromTailToHead1(node);
        for (int val : res1) {
            System.out.println(val);
        }
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}