package com.kaesar.java_sort;

/**
 * 快速排序
 */
public class QuickSort implements JavaSort {

  @Override
  public int[] sort(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }
    return sort(array, 0, array.length - 1);
  }

  public int[] sort(int[] array, int start, int end) {
    if (array.length < 1 || start < 0 || end >= array.length || start > end) {
      return null;
    }
    int smallIndex = partion(array, start, end);
    if (smallIndex > start) {
      sort(array, start, smallIndex - 1);
    }
    if (smallIndex < end) {
      sort(array, smallIndex + 1, end);
    }
    return array;
  }

  /**
   * 快速排序算法
   *
   * @param array
   * @param start
   * @param end
   * @return
   */
  public static int partion(int[] array, int start, int end) {
    int pivot = (int) (start + Math.random() * (end - start + 1));
    int smallIndex = start - 1;
    swap(array, pivot, end);
    for (int i = start; i <= end; i++) {
      if (array[i] <= array[end]) {
        smallIndex++;
        if (i > smallIndex) {
          swap(array, i, smallIndex);
        }
      }
    }
    return smallIndex;
  }

  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
