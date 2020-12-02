package com.kaesar.sword2offer;

/**
 * 标题：二叉查找树的第 K 个结点
 * 题目描述
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 题目链接：
 * https://www.nowcoder.com/practice/ef068f602dde4d28aab2b210e859150a?tpId=13&&tqId=11215&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz62 {

  private TreeNode result;
  private int cnt;

  /**
   * 中序遍历
   *
   * @param pRoot
   * @param k
   * @return
   */
  TreeNode kthNode(TreeNode pRoot, int k) {
    inOrder(pRoot, k);
    return result;
  }

  private void inOrder(TreeNode root, int k) {
    if (root == null || cnt >= k) {
      return;
    }
    inOrder(root.left, k);
    cnt++;
    if (cnt == k) {
      result = root;
    }
    inOrder(root.right, k);
  }
}
