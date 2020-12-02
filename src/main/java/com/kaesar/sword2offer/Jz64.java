package com.kaesar.sword2offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 标题：滑动窗口的最大值
 * 题目描述
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * 窗口大于数组长度的时候，返回空
 * 题目链接：
 * https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788?tpId=13&&tqId=11217&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz64 {

  public ArrayList<Integer> maxInWindows(int[] num, int size) {
    ArrayList<Integer> result = new ArrayList<>();
    if (size > num.length || size < 1) {
      return result;
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1); // 大顶堆
    for (int i = 0; i < size; i++) {
      heap.add(num[i]);
    }
    result.add(heap.peek());
    for (int i = 0, j = i + size; j < num.length; i++, j++) { // 维护一个大小为 size 的大顶堆
      heap.remove(num[i]);
      heap.add(num[j]);
      result.add(heap.peek());
    }
    return result;
  }
}
