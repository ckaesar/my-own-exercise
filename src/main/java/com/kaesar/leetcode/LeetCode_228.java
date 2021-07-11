package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }
        int start = nums[0], end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    result.add("" + start);
                } else {
                    result.add(start + "->" + end);
                }
                start = end = nums[i];
            }
        }
        if (start == end) {
            result.add("" + start);
        } else {
            result.add(start + "->" + end);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        for (String summaryRange : summaryRanges(nums)) {
            System.out.println(summaryRange);
        }
    }
}
