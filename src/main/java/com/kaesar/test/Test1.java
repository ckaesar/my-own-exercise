package com.kaesar.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 完全二叉树，求从根节点到叶子结点的和的最小的路径
 */
public class Test1 {

  private List<Integer> result = new ArrayList<>();
  private List<Integer> path = new ArrayList<>();
  private int min = Integer.MAX_VALUE;

  public List<Integer> findPath(TreeNode root) {
    if (root == null) {
      return null;
    }
    findMin(root, path, 0);
    return result;
  }

  public int findMin(TreeNode root, List<Integer> path, int total) {
    if (root == null) {
      return total;
    }
    path.add(root.val);
    if (root.left == null && root.right == null && total + root.val < min) {
      min = total + root.val;
      result.removeAll(result);
      for (int i = 0; i < path.size(); i++) {
        result.add(path.get(i));
      }
    }
    int leftVal = findMin(root.left, path, total + root.val);
    int rightVal = findMin(root.right, path, total + root.val);
    path.remove(path.size() - 1);
    return total + Math.min(leftVal, rightVal);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    Test1 test1 = new Test1();
    List<Integer> path = test1.findPath(root);
    for (int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + " ");
    }

  }
}


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode(int val) {
    this.val = val;
  }
}
