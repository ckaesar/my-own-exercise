package com.kaesar.java_sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort implements JavaSort {

  @Override
  public int[] sort(int[] array) {
    if (array == null || array.length < 2) {
      return array;
    }

    int mid = array.length / 2;
    int[] left = Arrays.copyOfRange(array, 0, mid);
    int[] right = Arrays.copyOfRange(array, mid, array.length);
    return merge(sort(left), sort(right));
  }

  /**
   * 归并排序-将两段排序好的数组结合成一个排序数组
   *
   * @param left
   * @param right
   * @return
   */
  public static int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    for (int index = 0, leftIndex = 0, rightIndex = 0; index < result.length; index++) {
      if (leftIndex >= left.length) {
        result[index] = right[rightIndex++];
      } else if (rightIndex >= right.length) {
        result[index] = left[leftIndex++];
      } else if (left[leftIndex] > right[rightIndex]) {
        result[index] = right[rightIndex];
      } else {
        result[index] = left[leftIndex];
      }
    }
    return result;
  }
}
