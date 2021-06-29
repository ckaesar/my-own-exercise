package com.kaesar.leetcode;

import java.util.Arrays;

public class LeetCode_031 {
    public static void nextPermutation(int[] nums) {
        // 如果数组为空，或者数组的长度为0或者只有一个元素，不用处理
        if (nums == null || nums.length < 2) {
            return;
        }
        // 是否找到更大的排列
        boolean handled = false;
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    // 找到更大的排列
                    // 1.首先将 i 的数字和 j 的数字调换位置
                    exch(nums, j, i);
                    // 2.首先将 i+1 后面的数字倒排
                    for (int x = i + 1; x < (nums.length + i + 1) / 2; x++) {
                        exch(nums, x, nums.length - 1 - (x - i) / 2);
                    }
                    // 3.然后将 j+1到i-1 之间的数字跟 i+1到nums.length-1 的数字整体调换顺序
                    for (int x = i - 1; x >= j + 1; x--) {
                        for (int y = x; y < nums.length - 1; y++) {
                            exch(nums, y, y + 1);
                        }
                    }
                    // 4.然后将 j+1 位置的数字移到小于它的数字之后
                    for (int x = j + 1; x < nums.length - 1; x++) {
                        if (nums[x] > nums[x + 1]) {
                            exch(nums, x, x + 1);
                        } else {
                            break;
                        }
                    }
                    // 找到最大的排列， 循环结束
                    handled = true;
                    break;
                }
            }
            if (handled) {
                break;
            }
        }
        // 如果handled为false，说明没有更大的排列，也就是不存在下一个更大排列，将数字重新排列成最小的排列，
        // 就是将顺序倒排
        if (!handled) {
            for (int i = 0; i < nums.length / 2; i++) {
                exch(nums, i, nums.length - 1 - i);
            }
        }
    }

    private static void exch(int[] nums, int left, int right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 0, 2, 3, 2, 0};
        System.out.println("=====处理前=====");
        Arrays.stream(nums).forEach(num -> {
            System.out.print(num + " ");
        });
        System.out.println();
        System.out.println("=====处理后=====");
        nextPermutation(nums);
        Arrays.stream(nums).forEach(num -> {
            System.out.print(num + " ");
        });
    }
}
