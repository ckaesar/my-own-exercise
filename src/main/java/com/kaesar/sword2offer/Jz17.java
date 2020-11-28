package com.kaesar.sword2offer;

/**
 * 标题：树的子结构
 * 题目描述
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 题目链接：
 * https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88?tpId=13&&tqId=11170&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz17 {

  public boolean hasSubtree(TreeNode root1, TreeNode root2) {
    if (root1 == null || root2 == null) {
      return false;
    }

    return isSubtreeWithRoot(root1, root2) || hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
  }

  private boolean isSubtreeWithRoot(TreeNode root1, TreeNode root2) {
    if (root2 == null) {
      return true;
    }
    if (root1 == null) {
      return false;
    }
    if (root1.val != root2.val) {
      return false;
    }
    return isSubtreeWithRoot(root1.left, root2.left) && isSubtreeWithRoot(root1.right, root2.right);
  }
}