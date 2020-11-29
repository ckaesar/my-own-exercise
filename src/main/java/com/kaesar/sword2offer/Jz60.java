package com.kaesar.sword2offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 标题：把二叉树打印成多行
 * 题目描述
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 题目链接：
 * https://www.nowcoder.com/practice/445c44d982d04483b04a54f298796288?tpId=13&&tqId=11213&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz60 {

  ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
    Queue<TreeNode> treeNodes = new LinkedList<TreeNode>();
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    treeNodes.add(pRoot);
    while (!treeNodes.isEmpty()) {
      Queue<TreeNode> curNodes = new LinkedList<TreeNode>();
      curNodes.addAll(treeNodes);
      while (!treeNodes.isEmpty()) {
        treeNodes.poll();
      }
      ArrayList<Integer> curList = new ArrayList<Integer>();
      while (!curNodes.isEmpty()) {
        TreeNode t = curNodes.poll();
        if (t == null) {
          continue;
        }
        curList.add(t.val);
        treeNodes.add(t.left);
        treeNodes.add(t.right);
      }
      if (!curList.isEmpty()) {
        result.add(curList);
      }
    }
    return result;
  }
}
