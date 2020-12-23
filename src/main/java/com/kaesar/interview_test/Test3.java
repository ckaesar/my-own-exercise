package com.kaesar.interview_test;

import java.util.ArrayList;
import java.util.List;

/**
 * 示例 1:
 * <p>
 * 输入: intervals = [[1,3],[2,6],[2,5],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 * <p>
 * 输入: intervals = [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class Test3 {

  public static int[][] find(int[][] intervals) {
    if (intervals == null || intervals.length < 2) {
      return intervals;
    }
    List<List<int[]>> rets = new ArrayList<>();
    boolean[] used = new boolean[intervals.length];
    for (int i = 0; i < intervals.length; i++) {
      if(used[i]) {
        continue;
      }
      List<int[]> ret = new ArrayList<>();
      ret.add(intervals[i]);
      used[i] = true;
      for (int j = i + 1; j < intervals.length && !used[j]; j++) {
        for (int k = 0; k < ret.size(); k++) {
          if (isOverlapping(intervals[j], ret.get(k))) {
            used[j] = true;
            ret.add(intervals[j]);
            k++;
          }
        }
      }
      rets.add(ret);
    }
    int[][] result = new int[rets.size()][2];
    for (int i = 0; i < rets.size(); i++) {
      int a = Integer.MAX_VALUE, b = Integer.MIN_VALUE;
      for (int[] ab : rets.get(i)) {
        a = Math.min(ab[0], a);
        b = Math.max(ab[1], b);
      }
      result[i] = new int[] {a, b};
    }
    return result;
  }

  public static boolean isOverlapping(int[] a, int[] b) {
    if ((a[0] >= b[0] && a[0] <= b[1]) || (a[1] >= b[0] && a[1] <= b[1])) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[][] intervals = new int[][] {{1,3},{2,6},{2,5},{8,10},{15,18}};
    int[][] ints = find(intervals);
    for(int[] ab: ints) {
      for(int a: ab) {
        System.out.print(a + " ");
      }
      System.out.println();
    }
  }
}
