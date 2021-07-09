package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_144 {
    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        for (Integer integer : preorderTraversal(root)) {
            System.out.print(integer + " ");
        }
    }
}
