package com.kaesar.sword2offer;

import java.util.Arrays;

/**
 * 标题：把数组排成最小的数
 * 题目描述
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 题目链接：
 * https://www.nowcoder.com/practice/8fecd3f8ba334add803bf2a06af1b993?tpId=13&&tqId=11185&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz32 {

  public String printMinNumber(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      return "";
    }
    int n = numbers.length;
    String[] nums = new String[n];
    for (int i = 0; i < n; i++) {
      nums[i] = numbers[i] + "";
    }
    Arrays.sort(nums, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
    String result = "";
    for (String str : nums) {
      result += str;
    }
    return result;
  }
}