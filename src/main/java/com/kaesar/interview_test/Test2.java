package com.kaesar.interview_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 打印出二叉树从左侧看到的结点
 */
public class Test2 {

  public static List<Character> find(TreeNode root) {
    List<Character> result = new ArrayList<>();
    if (root == null) {
      return null;
    }
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    boolean flag = false;
    while (nodes.size() > 0) {
      flag = false;
      int size = nodes.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = nodes.poll();
        if (node == null) {
          continue;
        }
        if (!flag) {
          result.add(node.val);
          flag = true;
        }
        nodes.add(node.left);
        nodes.add(node.right);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode('F');
    root.left = new TreeNode('C');
    root.left.left = new TreeNode('A');
    root.left.right = new TreeNode('D');
    root.left.right.left = new TreeNode('B');
    root.right = new TreeNode('E');
    root.right.left = new TreeNode('H');
    root.right.right = new TreeNode('G');
    root.right.right.left = new TreeNode('M');
    System.out.println(find(root));
  }
}


class TreeNode {
  char val;
  TreeNode left;
  TreeNode right;

  public TreeNode(char val) {
    this.val = val;
  }
}