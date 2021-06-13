package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_018 {


    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return new ArrayList<>();
        }
        if (nums.length == 4 && nums[0] + nums[1] + nums[2] + nums[3] != target) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int first = 0, fourth = nums.length - 1; first < fourth - 2; first++) {
            // 过滤掉重复的
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            while (first < fourth - 2) {
                // 过滤掉重复的
                if (fourth < nums.length - 1 && nums[fourth] == nums[fourth + 1]) {
                    fourth--;
                    continue;
                }
                for (int second = first + 1, third = fourth - 1; second < third; second++) {
                    // 过滤掉重复的
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                    while (second < third && nums[first] + nums[second] + nums[third] + nums[fourth] > target) {
                        third--;
                    }
                    if (second != third && nums[first] + nums[second] + nums[third] + nums[fourth] == target) {
                        result.add(new ArrayList<>(Arrays.asList(new Integer[]{nums[first], nums[second], nums[third], nums[fourth]})));
                    }
                }
                fourth--;
            }
            fourth = nums.length - 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3, -1, 0, 2, 4, 5};
        for (List<Integer> integers : fourSum(nums, 0)) {
            for (Integer integer : integers) {
                System.out.print(integer + "/");
            }
            System.out.println();
        }
    }
}