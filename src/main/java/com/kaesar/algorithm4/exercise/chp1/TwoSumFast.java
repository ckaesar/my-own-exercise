package com.kaesar.algorithm4.exercise.chp1;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.BinarySearch;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TwoSumFast {
  public static int count(int[] a) {
    // 计算和为0的整数对的数目
    Arrays.sort(a);
    int N = a.length;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (BinarySearch.rank(-a[i], a) > i) {
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
      a[i] = i - 4;
      System.out.print(i - 4 + " ");
    }
    System.out.println();
    StdOut.println(count(a));
  }
}
