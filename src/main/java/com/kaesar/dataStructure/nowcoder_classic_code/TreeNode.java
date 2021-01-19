package com.kaesar.dataStructure.nowcoder_classic_code;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }

  /**
   * case1
   *          1
   *      2       3
   *   4    5   6   7
   * 8                9
   */
  public static TreeNode testCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.left.left = new TreeNode(8);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    root.right.right.right = new TreeNode(9);
    return root;
  }
}