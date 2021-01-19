package com.kaesar.dataStructure.nowcoder_classic_code;

/**
 * 标题：二叉树的最小深度
 * 题目描述
 * 求给定二叉树的最小深度。最小深度是指树的根结点到最近叶子结点的最短路径上结点的数量。
 * 题目链接
 * https://www.nowcoder.com/practice/e08819cfdeb34985a8de9c4e6562e724?tpId=46&&tqId=29030&rp=1&ru=/ta/classic-code&qru=/ta/classic-code/question-ranking
 */
public class Lc001 {

  public static int run(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    if (root.left == null) {
      return run(root.right) + 1;
    }
    if (root.right == null) {
      return run(root.left) + 1;
    }
    return Math.min(run(root.left) + 1, run(root.right) + 1);
  }

  public static void main(String[] args) {
    TreeNode root = TreeNode.testCase1();
    System.out.println(run(root));
  }
}
