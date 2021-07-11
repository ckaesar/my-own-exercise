package com.kaesar.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> notRepeatedNums = new HashSet<>();
        for (int num : nums) {
            if (!notRepeatedNums.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
