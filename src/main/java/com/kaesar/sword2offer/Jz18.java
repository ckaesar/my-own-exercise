package com.kaesar.sword2offer;

/**
 * 标题：二叉树的镜像
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 题目链接：
 * https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011?tpId=13&&tqId=11171&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz18 {

  public void mirror11(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return;
    }
    TreeNode left = root.left;
    TreeNode right = root.right;
    mirror11(left);
    mirror11(right);
    root.left = right;
    root.right = left;
  }


  public void mirror(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return;
    }
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    mirror(root.left);
    mirror(root.right);
  }
}
