package com.kaesar.sword2offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 标题：数组中重复的数字
 * 题目描述
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中
 * 第一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * 返回描述：
 * 如果数组中有重复的数字，函数返回true，否则返回false。
 * 如果数组中有重复的数字，把重复的数字放到参数duplication[0]中。（ps:duplication已经初始化，可以直接赋值使用。）
 * <p>
 * 题目链接
 * https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8?tpId=13&&tqId=11203&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz50 {

  public static boolean duplicate11(int[] numbers, int length, int[] duplication) {
    if (length <= 1) {
      return false;
    }

    Set<Integer> numSet = new HashSet<>();
    for (int i = 0; i < numbers.length; i++) {
      if (numSet.contains(numbers[i])) {
        duplication[0] = numbers[i];
        return true;
      }
      numSet.add(numbers[i]);
    }
    return false;
  }

  /**
   * 暴力破解
   *
   * @param numbers
   * @param length
   * @param duplication
   * @return
   */
  public static boolean duplicate(int[] numbers, int length, int[] duplication) {
    if (length <= 1) {
      return false;
    }

    for (int i = 0; i < length - 1; i++) {
      for (int j = i + 1; j < length; j++) {
        if (numbers[j] == numbers[i]) {
          duplication[0] = numbers[i];
          return true;
        }
      }
    }
    return false;
  }

  public static boolean duplicate1(int[] nums, int length, int[] duplication) {
    if (nums == null || length <= 0) {
      return false;
    }
    for (int i = 0; i < length; i++) {
      while (nums[i] != i) {
        if (nums[i] == nums[nums[i]]) {
          duplication[0] = nums[i];
          return true;
        }
        swap(nums, i, nums[i]);
      }
    }
    return false;
  }

  public static void swap(int[] nums, int i, int j) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
  }

  public static void main(String[] args) {
    int[] numbers = {2, 3, 1, 0, 2, 5, 2};
    int[] duplication = new int[1];
    int[] duplication2 = new int[1];
    int[] duplication11 = new int[1];
    boolean duplicate = duplicate(numbers, 7, duplication);
    System.out.println(duplicate);
    System.out.println(duplication[0]);

    boolean duplicate1 = duplicate1(numbers, 7, duplication2);
    System.out.println(duplicate1);
    System.out.println(duplication2[0]);

    boolean duplicate11 = duplicate11(numbers, 7, duplication11);
    System.out.println(duplicate11);
    System.out.println(duplication11[0]);
  }
}
