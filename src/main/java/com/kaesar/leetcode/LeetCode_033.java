package com.kaesar.leetcode;

public class LeetCode_033 {
    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        // 最大值的位置
        int maxIndx = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                maxIndx = i;
                break;
            }
        }
        if (target <= nums[nums.length - 1]) {
            return find(nums, maxIndx + 1, nums.length - 1, target);
        } else {
            return find(nums, 0, maxIndx, target);
        }
    }

    /**
     * 二分查找
     * @param nums
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static int find(int[] nums, int left, int right, int target) {
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
    }
}
