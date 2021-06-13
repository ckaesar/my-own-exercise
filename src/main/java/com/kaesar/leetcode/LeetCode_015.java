package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_015 {
    /**
     * 方法一：暴力破解法
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int count = 0;
        // 第一层循环：遍历第一个数字
        for (int first = 0; first < nums.length - 2; first++) {
            if (nums[first] > 0) {
                return result;
            }
            // 不允许重复
            if (count > 0 && nums[first] == result.get(count - 1).get(0)) {
                continue;
            }
            // 第二重循环：遍历第二个数字
            for (int second = first + 1; second < nums.length - 1; second++) {
                // 当前2个数字之和已经大于0了，遍历第三个数字已经没有意义了
                if (nums[first] + nums[second] > 0) {
                    break;
                }
                // 第三重循环：遍历第三个数字
                for (int three = second + 1; three < nums.length; three++) {
                    if (nums[first] + nums[second] + nums[three] == 0) {
                        if (count > 0 && nums[first] == result.get(count - 1).get(0) &&
                                nums[second] == result.get(count - 1).get(1) &&
                                nums[three] == result.get(count - 1).get(2)) {
                            continue;
                        }
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[first]);
                        temp.add(nums[second]);
                        temp.add(nums[three]);
                        result.add(temp);
                        count++;
                        break;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 方法二：双指针法
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum1(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // 第一层循环：遍历第一个数字
        for (int first = 0; first < nums.length - 2; first++) {
            // 不允许重复
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = nums.length - 1;
            for (int second = first + 1; second < nums.length - 1; second++) {
                // 不允许重复
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                // second和third 2个从两边一起向中间遍历，这样就减少了一层循环
                while (second < third && nums[first] + nums[second] + nums[third] > 0) {
                    // 当3个数之和大于0时，将third往左移取更小的数，直到 second >= third
                    third--;
                }

                // 不存在符合条件的元组
                if (second == third) {
                    break;
                }

                if (nums[first] + nums[second] + nums[third] == 0) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[first]);
                    temp.add(nums[second]);
                    temp.add(nums[third]);
                    result.add(temp);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        List<List<Integer>> lists = threeSum(nums);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + "/");
            }
            System.out.println();
        }

        System.out.println();

        List<List<Integer>> lists2 = threeSum1(nums);
        for (List<Integer> list : lists2) {
            for (Integer integer : list) {
                System.out.print(integer + "/");
            }
            System.out.println();
        }
    }
}