package com.kaesar.leetcode;

public class LeetCode_026 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int current = 1;
        int index = 1;
        int pre = nums[0];
        while (index < nums.length) {
            if (!(nums[index] == pre)) {
                nums[current++] = nums[index];
            }
            pre = nums[index];
            index++;
        }
        return current;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println(result);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
