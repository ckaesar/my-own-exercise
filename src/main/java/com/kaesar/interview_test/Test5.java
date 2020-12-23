package com.kaesar.interview_test;

/**
 * [0, 1, 3, -6, 7, 4, -9, 4, ...]
 */
public class Test5 {

  public int max(int[] nums) {
    if (nums == null) {
      return -1;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    int result = Integer.MAX_VALUE;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (max < 0) {
        result = Math.max(result, max);
        max = nums[i];
      } else {
        max += nums[i];
      }
    }
    return result;
  }
}
