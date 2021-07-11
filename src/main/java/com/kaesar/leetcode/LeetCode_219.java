package com.kaesar.leetcode;

public class LeetCode_219 {
    /**
     * 暴力破解法
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                if (nums[i] == nums[j] && (j - i) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(nums, 3));
    }
}
