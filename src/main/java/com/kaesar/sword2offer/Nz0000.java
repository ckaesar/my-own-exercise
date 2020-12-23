package com.kaesar.sword2offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 树的前序遍历，中序遍历，后序遍历
 */
public class Nz0000 {

  /**
   * 前序遍历：递归
   *
   * @param root
   * @return
   */
  public static List<Integer> preOrderRecursion(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
      result.add(root.val);
      result.addAll(preOrderRecursion(root.left));
      result.addAll(preOrderRecursion(root.right));
    }
    return result;
  }

  /**
   * 前序遍历：非递归
   *
   * @param root
   * @return
   */
  public static List<Integer> preOrderNotRecursion(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> nodes = new Stack<>();
    nodes.push(root);
    while (nodes.size() > 0) {
      TreeNode node = nodes.pop();
      if (node != null) {
        result.add(node.val);
        nodes.push(node.right);
        nodes.push(node.left);
      }
    }
    return result;
  }

  /**
   * 中序遍历-递归
   *
   * @param root
   * @return
   */
  public static List<Integer> inOrderRecursion(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
      result.addAll(inOrderRecursion(root.left));
      result.add(root.val);
      result.addAll(inOrderRecursion(root.right));
    }
    return result;
  }

  /**
   * 中序遍历-非递归
   *
   * @param root
   * @return
   */
  public static List<Integer> inOrderNotRecursion(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> nodes = new Stack<>();
    TreeNode cur = root;
    while (cur != null || nodes.size() > 0) {
      while (cur != null) {
        nodes.push(cur);
        cur = cur.left;
      }
      if (nodes.size() > 0) {
        cur = nodes.pop();
        result.add(cur.val);
        cur = cur.right;
      }
    }
    return result;
  }

  /**
   * 后序遍历-递归
   *
   * @param root
   * @return
   */
  public static List<Integer> postOrderRecursion(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
      result.addAll(postOrderRecursion(root.left));
      result.addAll(postOrderRecursion(root.right));
      result.add(root.val);
    }
    return result;
  }

  /**
   * 后序遍历-非递归
   *
   * @param root
   * @return
   */
  public static List<Integer> postOrderNotRecursion(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> nodes = new Stack<>();
    Stack<Integer> nums = new Stack<>();
    TreeNode cur = root;
    int i = 1;
    while (cur != null || nodes.size() > 0) {
      while (cur != null) {
        nodes.push(cur);
        nums.push(0);
        cur = cur.left;
      }
      while (nodes.size() > 0 && nums.peek() == i) {
        nums.pop();
        result.add(nodes.pop().val);
      }
      if (nodes.size() > 0) {
        nums.pop();
        nums.push(1);
        cur = nodes.peek();
        cur = cur.right;
      }
    }
    return result;
  }


  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);

    // 前序遍历-递归
    List<Integer> result1 = preOrderRecursion(root);
    System.out.println("前序遍历-递归结果");
    for (int num : result1) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 前序遍历-非递归
    List<Integer> result11 = preOrderNotRecursion(root);
    System.out.println("前序遍历-非递归结果");
    for (int num : result11) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 中序遍历-递归
    List<Integer> result2 = inOrderRecursion(root);
    System.out.println("中序遍历-递归结果");
    for (int num : result2) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 中序遍历-非递归
    List<Integer> result22 = inOrderNotRecursion(root);
    System.out.println("中序遍历-非递归结果");
    for (int num : result22) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 后序遍历-递归
    List<Integer> result3 = postOrderRecursion(root);
    System.out.println("后序遍历-递归结果");
    for (int num : result3) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 后序遍历-非递归
    List<Integer> result33 = postOrderNotRecursion(root);
    System.out.println("后序遍历-非递归结果");
    for (int num : result33) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
