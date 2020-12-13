package com.kaesar.java_sort;

/**
 * 选择排序
 */
public class SelectionSort implements JavaSort {

  @Override
  public int[] sort(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }

    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int j = i; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          // 找到最小的数，将最小数的索引保存
          minIndex = j;
        }
      }
      if (minIndex != i) {
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
      }
    }
    return array;
  }
}
