package com.kaesar.sword2offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 标题：重建二叉树
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中
 * 都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 * <p>
 * 题目链接
 * https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tags=&title=&diffculty=0&judgeStatus=0&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Jz04 {

  // 缓存中序遍历数组每个值对应的索引
  private Map<Integer, Integer> indexForInOrders = new HashMap<Integer, Integer>();

  public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
    for (int i = 0; i < in.length; i++) {
      indexForInOrders.put(in[i], i);
    }
    return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
  }

  private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
    if (preL > preR) {
      return null;
    }
    TreeNode root = new TreeNode(pre[preL]);
    int inIndex = indexForInOrders.get(root.val);
    int leftTreeSize = inIndex - inL;
    root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
    root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
    return root;
  }

  public TreeNode reConstructBinaryTree2(int [] pre,int [] in) {
    if (pre.length == 0 || in.length == 0) {
      return null;
    }
    TreeNode root = new TreeNode(pre[0]);
    // 在中序中找到前序的根
    for (int i = 0; i < in.length; i++) {
      if (in[i] == pre[0]) {
        // 左子树，注意 copyOfRange 函数，左闭右开
        root.left = reConstructBinaryTree2(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
        // 右子树，注意 copyOfRange 函数，左闭右开
        root.right = reConstructBinaryTree2(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
        break;
      }
    }
    return root;
  }

  public static void main(String[] args) {
    int[] pre = new int[] {3, 9, 20, 15, 7};
    int[] in = new int[] {9, 3, 15, 20, 7};
    Jz04 jz04 = new Jz04();
    TreeNode treeNode = jz04.reConstructBinaryTree(pre, in);
    System.out.println(treeNode);
  }
}


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}