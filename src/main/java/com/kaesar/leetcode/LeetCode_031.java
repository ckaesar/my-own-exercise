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
        // 首先找到需要调换位置的数字
        int left = -1, right = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    if (j > left) {
                        left = j;
                        right = i;
                    } else if (j == left) {
                        if (i == right) {
                            left = j;
                            right = i;
                        }
                    }
                    handled = true;
                    break;
                }
            }
        }

        if (handled) {
            // 找到更大的排列
            // 1.首先将 right 的数字和 left 的数字调换位置
            exch(nums, left, right);
            // 2.首先将 right+1 后面的数字倒排
            for (int x = right + 1; x < (nums.length + right + 1) / 2; x++) {
                exch(nums, x, nums.length - 1 - (x - right) / 2);
            }
            // 3.然后将 left+1到right-1 之间的数字跟 right+1到nums.length-1 的数字整体调换顺序
            for (int x = right - 1; x >= left + 1; x--) {
                for (int y = x; y < nums.length - 1; y++) {
                    exch(nums, y, y + 1);
                }
            }
            // 4.然后将 left+1 位置的数字移到小于它的数字之后
            for (int x = left + 1; x < nums.length - 1; x++) {
                if (nums[x] > nums[x + 1]) {
                    exch(nums, x, x + 1);
                } else {
                    break;
                }
            }
        } else {
            // 如果handled为false，说明没有更大的排列，也就是不存在下一个更大排列，将数字重新排列成最小的排列，
            // 就是将顺序倒排
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
