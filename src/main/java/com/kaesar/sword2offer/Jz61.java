package com.kaesar.sword2offer;

/**
 * 标题：序列化二叉树
 * 题目描述
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * <p>
 * 二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，从而使得内存中建立起来的二叉树可以持久保存。
 * 序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，序列化时通过
 * 某种符号表示空节点（#），以 ！ 表示一个结点值的结束（value!）。
 * <p>
 * 二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 * <p>
 * 例如，我们可以把一个只有根节点为1的二叉树序列化为"1,"，然后通过自己的函数来解析回这个二叉树
 * <p>
 * 题目链接：
 * https://www.nowcoder.com/practice/cf7e25aa97c04cc1a68c8f040e71fb84?tpId=13&&tqId=11214&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz61 {

  private String deserializeStr;

  String serialize(TreeNode root) {
    if (root == null) {
      return "#";
    }
    return root.val + " " + serialize(root.left) + " " + serialize(root.right);
  }

  TreeNode deserialize(String str) {
    deserializeStr = str;
    return deserialize();
  }

  private TreeNode deserialize() {
    if (deserializeStr.length() == 0) {
      return null;
    }
    int index = deserializeStr.indexOf(" ");
    String node = index == -1 ? deserializeStr : deserializeStr.substring(0, index);
    deserializeStr = index == -1 ? "" : deserializeStr.substring(index + 1);
    if (node.equals("#")) {
      return null;
    }
    int val = Integer.valueOf(node);
    TreeNode t = new TreeNode(val);
    t.left = deserialize();
    t.right = deserialize();
    return t;
  }
}