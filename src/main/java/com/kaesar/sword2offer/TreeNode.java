package com.kaesar.sword2offer;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }

  /**
   * case1
   *         1
   *     2       3
   *   4   5   6
   * @return
   */
  public static TreeNode testCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    return root;
  }
}