package com.kaesar.sword2offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 标题：最小的 K 个数
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * 题目链接：
 * https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=13&&tqId=11182&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz29 {

  public ArrayList<Integer> getLeastNumbers_Solution11(int[] nums, int k) {
    if (k > nums.length || k <= 0) {
      return new ArrayList<>();
    }
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
    for (int num : nums) {
      maxHeap.add(num);
      if (maxHeap.size() > k) {
        maxHeap.poll();
      }
    }
    return new ArrayList<>(maxHeap);
  }

  public ArrayList<Integer> getLeastNumbers_Solution(int[] input, int k) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (input == null) {
      return result;
    }
    if (k > input.length) {
      return result;
    }
    Arrays.sort(input);
    for (int i = 0; i < k; i++) {
      if (i < input.length) {
        result.add(input[i]);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Jz29 jz29 = new Jz29();
    int[] input = new int[] {4, 5, 1, 6, 2, 7, 3, 8};
    ArrayList<Integer> result = jz29.getLeastNumbers_Solution(input, 10);
    for (Integer data : result) {
      System.out.println(data);
    }
  }
}
