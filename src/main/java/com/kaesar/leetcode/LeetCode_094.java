package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_094 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        for (Integer integer : inorderTraversal(root)) {
            System.out.print(integer + " ");
        }
    }
}
