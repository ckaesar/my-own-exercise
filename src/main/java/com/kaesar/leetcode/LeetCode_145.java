package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_145 {
    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        for (Integer integer : postorderTraversal(root)) {
            System.out.print(integer + " ");
        }
    }
}
