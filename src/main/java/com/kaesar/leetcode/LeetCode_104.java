package com.kaesar.leetcode;

public class LeetCode_104 {
    public static int result = 0;

    public static int maxDepth(TreeNode root) {
        maxDepth(root, 0);
        return result;
    }

    public static void maxDepth(TreeNode root, int curDepth) {
        if (root == null) {
            if (curDepth > result) {
                result = curDepth;
            }
            return;
        }
        curDepth++;
        maxDepth(root.left, curDepth);
        maxDepth(root.right, curDepth);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        System.out.println(maxDepth(root));
    }
}
