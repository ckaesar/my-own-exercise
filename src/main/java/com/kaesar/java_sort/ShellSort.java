package com.kaesar.java_sort;

/**
 * 希尔排序
 */
public class ShellSort implements JavaSort {

  @Override
  public int[] sort(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }

    int len = array.length;
    int temp, gap = len / 2;
    while (gap > 0) {
      for (int i = gap; i < len; i++) {
        temp = array[i];
        int preIndex = i - gap;
        while (preIndex >= 0 && array[preIndex] > temp) {
          array[preIndex + gap] = array[preIndex];
          preIndex -= gap;
        }
        array[preIndex + gap] = temp;
      }
      gap /= 2;
    }
    return array;
  }
}
