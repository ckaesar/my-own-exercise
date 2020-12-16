package com.kaesar.sword2offer;

import java.util.*;

/**
 * 标题：按之字形顺序打印二叉树
 * 题目描述
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 * 题目链接：
 * https://www.nowcoder.com/practice/91b69814117f4e8097390d107d2efbe0?tpId=13&&tqId=11212&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz59 {

  public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
    Queue<TreeNode> treeNodes = new LinkedList<>();
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    treeNodes.add(pRoot);
    boolean flag = true; // 当flag为true时，栈从左向右放；当flag为false时，栈从右向左放
    while (!treeNodes.isEmpty()) {
      int cnt = treeNodes.size();
      ArrayList<Integer> curList = new ArrayList<>();
      Stack<TreeNode> curNodes = new Stack<>();
      while (cnt-- > 0) {

        TreeNode t = treeNodes.poll();
        if (t == null) {
          continue;
        }
        curList.add(t.val);
        if (flag) {
          curNodes.add(t.left);
          curNodes.add(t.right);
        } else {
          curNodes.add(t.right);
          curNodes.add(t.left);
        }
      }
      flag = !flag;
      while (!curNodes.isEmpty()) {
        treeNodes.add(curNodes.pop());
      }
      if (!curList.isEmpty()) {
        result.add(curList);
      }
    }
    return result;
  }

}
