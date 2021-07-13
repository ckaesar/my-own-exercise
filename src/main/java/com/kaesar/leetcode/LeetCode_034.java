package com.kaesar.leetcode;

import javafx.util.Pair;

public class LeetCode_034 {
    public static int[] searchRange(int[] nums, int target) {
        Pair<Integer, Integer> result = find(nums, 0, nums.length - 1, target);
        return new int[]{result.getKey(), result.getValue()};
    }

    public static Pair<Integer, Integer> find(int[] nums, int low, int high, int target) {
        int mid, left = -1, right = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                if (mid + 1 <= high && nums[mid + 1] == nums[mid]) {
                    right = find(nums, mid + 1, high, target).getValue();

                } else {
                    right = mid;
                }
                if (mid - 1 >= low && nums[mid - 1] == nums[mid]) {
                    left = find(nums, low, mid - 1, target).getKey();
                } else {
                    left = mid;
                }
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new Pair<>(left, right);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] ints = searchRange(nums, 8);
        System.out.println("[" + ints[0] + "," + ints[1] + "]");
    }
}
