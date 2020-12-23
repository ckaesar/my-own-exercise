package com.kaesar.interview_test;

/**
 *
 */
public class Test6 {

  public int findIndex(int[] nums, int key) {
    if (nums == null || nums.length == 0) {
      return -1;
    }
    int medium = -1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] < nums[i + 1]) {
        medium = i;
      }
    }
    int l = 0, h = nums.length - 1;
    if (nums[medium] == key) {
      return medium;
    } else if (nums[medium] > key) {
      return findIndex(nums, key, medium, (medium + h) / 2, h);
    } else {
      return findIndex(nums, key, l, (l + medium) / 2, medium);
    }
  }

  public int findIndex(int[] nums, int key, int low, int m, int high) {
    if (nums[m] == key) {
      return m;
    } else if (nums[m] > key) {
      return findIndex(nums, key, low, (low + m) / 2, m);
    } else {
      return findIndex(nums, key, m, (m + high) / 2, high);
    }
  }
}
