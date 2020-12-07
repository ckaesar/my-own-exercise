package com.kaesar.sword2offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 标题：从上往下打印二叉树
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 题目链接：
 * https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&&tqId=11175&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz22 {

  public ArrayList<Integer> printFromTopToBottom11(TreeNode root) {
    Queue<TreeNode> nodes = new LinkedList<>();
    ArrayList<Integer> result = new ArrayList<>();
    nodes.add(root);
    while (nodes.size() > 0) {
      TreeNode node = nodes.poll();
      if (node != null) {
        result.add(node.val);
        nodes.add(node.left);
        nodes.add(node.right);
      }
    }
    return result;
  }


  /**
   * 使用队列来进行层次遍历。
   * <p>
   * 不需要使用两个队列分别存储当前层的节点和下一层的节点，因为在开始遍历一层的节点时，当前队列中的节点数就是当前层的节点数，只要控制遍历这么多节点数，就能保证这次遍历的都是当前层的节点。
   *
   * @param root
   * @return
   */
  public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int cnt = queue.size();
      while (cnt-- > 0) {
        TreeNode t = queue.poll();
        if (t == null) {
          continue;
        }
        result.add(t.val);
        queue.add(t.left);
        queue.add(t.right);
      }
    }
    return result;
  }

  public static void main(String[] args) {

  }
}