package com.kaesar.leetcode;

public class LeetCode_034 {
    public static int[] searchRange(int[] nums, int target) {
        int left = -1, right = -1;

        return new int[]{left, right};
    }

    public static int find(int[] nums, int low, int high, int target) {
        int mid, left = -1, right = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                if(mid + 1 < high && nums[mid + 1] == nums[mid]) {
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] ints = searchRange(nums, 8);
        System.out.println("[" + ints[0] + "," + ints[1] + "]");
    }
}
