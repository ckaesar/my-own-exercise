//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
// Example:
//
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
//
//
//
//
package com.kaesar.leetcode;

public class Solution_1 {

  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    finish:
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          break finish;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {2, 7, 11, 14};
    int[] ints = new Solution_1().twoSum(nums, 9);
    System.out.println(ints[0] + " " + ints[1]);
  }
}
