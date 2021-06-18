package com.kaesar.leetcode;

public class LeetCode_027 {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int index = 0;
        int reverseCount = 0;
        while (index < nums.length - reverseCount) {
            if (nums[index] != val) {
                index++;
                count++;
            } else {
                if (index < (nums.length - 1 - reverseCount)) {
                    int temp = nums[index];
                    nums[index] = nums[nums.length - 1 - reverseCount];
                    nums[nums.length - 1 - reverseCount] = temp;
                    reverseCount++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(removeElement(nums, 1));
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
