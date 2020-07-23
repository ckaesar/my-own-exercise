package com.kaesar.algorithm4.exercise;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.BinarySearch;

import java.util.Arrays;

public class ThreeSumFast {
  public static int count(int[] a) {
    // 计算和为0的三元组的数目
    Arrays.sort(a);
    int N = a.length;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (BinarySearch.rank(-a[i] - a[j], a) > j) {
          cnt++;
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    int[] a = new int[15];
    for (int i = 0; i < 15; i++) {
      a[i] = i - 7;
      System.out.print(i - 7 + " ");
    }
    System.out.println();

    System.out.println(count(a));


  }
}
