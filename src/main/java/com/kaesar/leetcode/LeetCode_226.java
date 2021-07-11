package com.kaesar.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invertTree(root);
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (nodes.size() > 0) {
            TreeNode cur = nodes.poll();
            System.out.print(cur.val + " ");
            if (cur.left != null) {
                nodes.add(cur.left);
            }
            if (cur.right != null) {
                nodes.add(cur.right);
            }
        }
        for (TreeNode node : nodes) {
            System.out.print(node.val + " ");
        }
    }
}
