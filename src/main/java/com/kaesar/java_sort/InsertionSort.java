package com.kaesar.java_sort;

/**
 * 插入排序
 */
public class InsertionSort implements JavaSort {

  @Override
  public int[] sort(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }

    int current;
    for (int i = 0; i < array.length - 1; i++) {
      current = array[i + 1];
      int preIndex = i;
      while (preIndex >= 0 && current < array[preIndex]) {
        array[preIndex + 1] = array[preIndex];
        preIndex--;
      }
      array[preIndex + 1] = current;
    }
    return array;
  }
}
