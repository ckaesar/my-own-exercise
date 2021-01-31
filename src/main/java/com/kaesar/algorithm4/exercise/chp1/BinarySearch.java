package com.kaesar.algorithm4.exercise.chp1;

/**
 * 二分查找
 */
public class BinarySearch {

  /**
   * 递归
   *
   * @param key
   * @param a
   * @return
   */
  public static int rank(int key, int[] a) {
    return rank(key, a, 0, a.length - 1);
  }

  public static int rank(int key, int[] a, int lo, int hi) {
    // 如果key存在于a[]中，它的索引不会小于lo且不会大于hi
    if (lo > hi) {
      return -1;
    }
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) {
      return rank(key, a, lo, mid - 1);
    } else if (key > a[mid]) {
      return rank(key, a, mid + 1, hi);
    } else {
      return mid;
    }
  }

  /**
   * @param key
   * @param a
   * @return
   */
  public static int rank1(int key, int[] a) {
    // 数组必须是有序的
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      // 被查找的键要么不存在，要么必然存在于a[lo..hi]之中
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) {
        hi = mid - 1;
      } else if (key > a[mid]) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] listInts = new int[] {1, 2, 3, 4, 5, 9, 11, 19, 22, 53, 99};
    System.out.println(rank(19, listInts));
    System.out.println(rank1(19, listInts));
  }
}
