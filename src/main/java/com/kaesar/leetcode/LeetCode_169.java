package com.kaesar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_169 {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.get(Integer.valueOf(num)) == null) {
                count.put(Integer.valueOf(num), 1);
            } else {
                count.put(Integer.valueOf(num), count.get(Integer.valueOf(num)) + 1);
            }
        }
        int result = -1, maxCount = -1;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : count.entrySet()) {
            if (integerIntegerEntry.getValue() > maxCount) {
                maxCount = integerIntegerEntry.getValue();
                result = integerIntegerEntry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 4};
        System.out.println(majorityElement(nums));
    }
}
