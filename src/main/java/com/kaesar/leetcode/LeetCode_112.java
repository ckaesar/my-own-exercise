package com.kaesar.leetcode;

public class LeetCode_112 {
    public static boolean result = false;

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        hasPathSum(root, targetSum, 0);
        return result;
    }

    public static void hasPathSum(TreeNode root, int targetSum, int curSum) {
        if (root == null) {
            return;
        }
        curSum += root.val;
        if (root.left == null && root.right == null) {
            if (curSum == targetSum) {
                result = true;
            }
            return;
        }
        if (root.left == null && root.right != null) {
            hasPathSum(root.right, targetSum, curSum);
            return;
        }
        if (root.left != null && root.right == null) {
            hasPathSum(root.left, targetSum, curSum);
            return;
        }
        hasPathSum(root.left, targetSum, curSum);
        hasPathSum(root.right, targetSum, curSum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(hasPathSum(root, 5));
        System.out.println(hasPathSum(root, 4));
    }
}
