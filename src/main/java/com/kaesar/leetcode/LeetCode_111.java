package com.kaesar.leetcode;

public class LeetCode_111 {
    public static int result = Integer.MAX_VALUE;

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        minDepth(root, 0);
        return result;
    }

    public static void minDepth(TreeNode root, int curDepth) {
        if (root == null) {
            return;
        }
        curDepth++;
        if (root.left == null && root.right == null) {
            if (curDepth < result) {
                result = curDepth;
            }
            return;
        }
        if (root.left == null && root.right != null) {
            minDepth(root.right, curDepth);
            return;
        }
        if (root.left != null && root.right == null) {
            minDepth(root.left, curDepth);
            return;
        }
        minDepth(root.left, curDepth);
        minDepth(root.right, curDepth);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);
        System.out.println(minDepth(root));
    }
}
