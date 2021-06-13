package com.kaesar.leetcode;

import java.util.Arrays;

public class LeetCode_016 {
    /**
     * 双指针法
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);

        int result = nums[0] + nums[1] + nums[2];
        int difference = Math.abs(result - target);
        // 第一个数字
        for (int first = 0; first < nums.length - 2; first++) {
            //过滤掉重复的
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            for (int second = first + 1; second < nums.length - 1; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    // 过滤掉重复的
                    continue;
                }

                int third = nums.length - 1;
                while (second < third) {
                    // 当3个数之和比当前的result更接近时，更新result
                    if (Math.abs(nums[first] + nums[second] + nums[third] - target) < difference) {
                        result = nums[first] + nums[second] + nums[third];
                        difference = Math.abs(result - target);
                    }
                    third--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6};
        System.out.println(threeSumClosest(nums, 2));
    }
}