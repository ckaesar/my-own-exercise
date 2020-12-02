package com.kaesar.sword2offer;

/**
 * 标题：平衡二叉树
 * 题目描述
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * 题目链接：
 * https://www.nowcoder.com/practice/8b3b95850edb4115918ecebdf1b4d222?tpId=13&&tqId=11192&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz39 {

  private boolean isBalanced = true;

  public boolean isBalanced_Solution(TreeNode root) {
    height(root);
    return isBalanced;
  }

  private int height(TreeNode root) {
    if (root == null || !isBalanced) {
      return 0;
    }
    int left = height(root.left);
    int right = height(root.right);
    if (Math.abs(left - right) > 1) {
      isBalanced = false;
    }
    return 1 + Math.max(left, right);
  }
}
