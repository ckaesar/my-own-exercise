package com.kaesar.sword2offer;

/**
 * 标题：二叉树的深度
 * 题目描述
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 题目链接：
 * https://www.nowcoder.com/practice/435fb86331474282a3499955f0a41e8b?tpId=13&&tqId=11191&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz38 {

  public int treeDepth(TreeNode root) {
    return root == null ? 0 : 1 + Math.max(treeDepth(root.left), treeDepth((root.right)));
  }
}
