package com.kaesar.sword2offer;

/**
 * 标题：对称的二叉树
 * 题目描述
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * 题目链接：
 * https://www.nowcoder.com/practice/ff05d44dfdb04e1d83bdbdab320efbcb?tpId=13&&tqId=11211&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz58 {

  boolean isSymmetrical(TreeNode pRoot) {
    if (pRoot == null) {
      return true;
    }
    return isSymmetrical(pRoot.left, pRoot.right);
  }

  private boolean isSymmetrical(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return true;
    }
    if (t1 == null || t2 == null) {
      return false;
    }
    if (t1.val != t2.val) {
      return false;
    }
    return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
  }
}