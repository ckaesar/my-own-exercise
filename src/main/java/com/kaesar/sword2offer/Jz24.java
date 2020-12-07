package com.kaesar.sword2offer;

import java.util.ArrayList;

/**
 * 标题：二叉树中和为某一值的路径
 * 题目描述
 * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 题目链接：
 * https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca?tpId=13&&tqId=11177&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz24 {

  public ArrayList<ArrayList<Integer>> findPath11(TreeNode root, int target) {
    return null;
  }










  private ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

  public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
    backtracking(root, target, new ArrayList<Integer>());
    return ret;
  }

  private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
    if (node == null) {
      return;
    }
    path.add(node.val);
    target -= node.val;
    if (target == 0 && node.left == null && node.right == null) {
      ret.add(new ArrayList<Integer>(path));
    } else {
      backtracking(node.left, target, path);
      backtracking(node.right, target, path);
    }
    path.remove(path.size() - 1);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.remove(list.size() - 1);
    System.out.println();
  }
}

