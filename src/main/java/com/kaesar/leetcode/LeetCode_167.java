package com.kaesar.leetcode;

public class LeetCode_167 {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2) {
            if (numbers[0] + numbers[1] == target) {
                return new int[]{1, 2};
            } else {
                return null;
            }
        }
        for (int first = 0; first < numbers.length; first++) {
            int targetNum = target - numbers[first];
            int result = find(numbers, first + 1, numbers.length - 1, targetNum);
            if (result != -1) {
                return new int[]{first + 1, result + 1};
            }
        }
        return null;
    }

    /**
     * 二分法查找第二个数字
     *
     * @param numbers
     * @param left
     * @param right
     * @param target
     * @return 返回-1说明没有找到；否则返回对应的索引位置
     */
    public static int find(int[] numbers, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] > target) {
                right--;
            } else if (numbers[mid] == target) {
                return mid;
            } else {
                left++;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int[] result = twoSum(numbers, 9);
        System.out.println(result[0] + " " + result[1]);
    }
}
