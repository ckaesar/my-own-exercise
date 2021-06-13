package com.kaesar.leetcode;

public class LeetCode_004 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] allNums = new int[nums1.length + nums2.length];
        int i = 0, j = 0, x = 0;
        int num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE;
        for (; i < nums1.length || j < nums2.length; ) {
            if (i < nums1.length) {
                num1 = nums1[i];
            }
            if (j < nums2.length) {
                num2 = nums2[j];
            }
            if (num1 < num2) {
                allNums[x] = num1;
                i++;
            } else {
                allNums[x] = num2;
                j++;
            }
            x++;
            num1 = Integer.MAX_VALUE;
            num2 = Integer.MAX_VALUE;
        }
        int count = nums1.length + nums2.length;
        if (count % 2 == 1) {
            return allNums[count / 2];
        } else {
            return ((double) (allNums[count / 2 - 1] + allNums[count / 2])) / 2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}