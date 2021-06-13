package com.kaesar.leetcode;

public class LeetCode_011 {
    /**
     * 方法一：暴力求解法
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int length = j - i;
                int high = Math.min(height[i], height[j]);
                if (length * high > max) {
                    max = length * high;
                }
            }
        }
        return max;
    }

    /**
     * 双指针法
     *
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            int length = right - left;
            int high = Math.min(height[left], height[right]);
            if (length * high > max) {
                max = length * high;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
        System.out.println(maxArea2(height));
    }
}