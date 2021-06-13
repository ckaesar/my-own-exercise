package com.kaesar.leetcode;

import java.util.HashMap;
import java.util.Map;

class LeetCode_001 {
    /**
     * 方法一：暴力法
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
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

    /**
     * 方法二：用Map
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> oneMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            oneMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int two = target - nums[i];
            if (oneMap.containsKey(two) && oneMap.get(two) != i) {
                return new int[]{oneMap.get(two), i};
            }
        }
        throw new RuntimeException("找不到");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 1, 22, 91, 23};
        int target = 26;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0] == 1);
        System.out.println(ints[1] == 3);

        int[] ints2 = twoSum2(nums, target);
        System.out.println(ints2[0] == 1 || ints2[0] == 3);
        System.out.println(ints2[1] == 3 || ints2[1] == 1);
    }
}