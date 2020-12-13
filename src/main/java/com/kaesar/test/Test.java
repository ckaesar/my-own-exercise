package com.kaesar.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    
  }

  public static void case3(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputStr = sc.nextLine();
    String[] strs = inputStr.split(",");
    int[] inputNums = new int[strs.length];
    for (int i = 0; i < strs.length; i++) {
      int cur = Integer.valueOf(strs[i]);
      if (!(cur > 0 && cur < 10)) {
        // 数字只能在1-9之间
        System.out.println(-1);
        return;
      }
      inputNums[i] = cur;
    }

    // 判重
    if (inputNums[0] == inputNums[1] || inputNums[1] == inputNums[2] || inputNums[0] == inputNums[2]) {
      System.out.println(-1);
      return;
    }
    // 判断是否有同时为2/5 或 6/9 的
    if ((inputNums[0] == 2 && inputNums[1] == 5) || (inputNums[0] == 5 && inputNums[1] == 2) ||
      (inputNums[0] == 6 && inputNums[1] == 9) || (inputNums[0] == 9 && inputNums[1] == 6) ||
      (inputNums[1] == 2 && inputNums[2] == 5) || (inputNums[1] == 5 && inputNums[2] == 2) ||
      (inputNums[1] == 6 && inputNums[2] == 9) || (inputNums[1] == 9 && inputNums[2] == 6) ||
      (inputNums[0] == 2 && inputNums[2] == 5) || (inputNums[0] == 5 && inputNums[2] == 2) ||
      (inputNums[1] == 6 && inputNums[2] == 9) || (inputNums[0] == 9 && inputNums[2] == 6)) {
      System.out.println(-1);
      return;
    }

    // 判断是否有 2/5/6/9
    if (inputNums[0] != 2 && inputNums[0] != 5 && inputNums[0] != 6 && inputNums[0] != 9 && inputNums[1] != 2 &&
      inputNums[1] != 5 && inputNums[1] != 6 && inputNums[1] != 9 && inputNums[2] != 2 && inputNums[2] != 5 &&
      inputNums[2] != 6 && inputNums[2] != 9) {
      Arrays.sort(inputNums);
      int max = inputNums[2];
      int count = 0;
      int maxNum = 0;
      // 个位数
      for (int i = 0; i < inputNums.length; i++) {
        count++;
        if (count == max) {
          System.out.println(inputNums[i]);
        }
        maxNum = inputNums[i];
      }
      // 两位数
      for (int i = 0; i < inputNums.length; i++) {
        for (int j = 0; j < inputNums.length && j != i; j++) {
          count++;
          if (count == max) {
            System.out.println(inputNums[i] * 10 + "" + inputNums[j]);
          }
          maxNum = Integer.valueOf(inputNums[i] * 10 + "" + inputNums[j]);
        }

      }

      // 三位数
      for (int i = 0; i < inputNums.length; i++) {
        for (int j = 0; i < inputNums.length && j != i; j++) {
          for (int k = 0; k < inputNums.length && k != i && k != j; k++) {
            count++;
            if (count == max) {
              System.out.println(inputNums[i] * 100 + "" + inputNums[j] * 10 + "" + inputNums[k]);
            }
            maxNum = Integer.valueOf(inputNums[i] * 100 + "" + inputNums[j] * 10 + "" + inputNums[k]);
          }
        }
      }
      if (count < max) {
        System.out.println(maxNum);
      }
    } else {

    }
  }

  public static void case2(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      String express = sc.nextLine();
      express.trim();
      int startIndex = Integer.valueOf(sc.nextLine());
      int endIndex = Integer.valueOf(sc.nextLine());
      String[] top = new String[startIndex];
      int topIndex = 0;
      String[] reverse = new String[endIndex - startIndex + 1];
      int reverseIndex = 0;
      int countWords = 0;
      StringBuilder sb = new StringBuilder(String.valueOf(express.charAt(0)));
      String[] tail = new String[1000];
      int tailIndex = 0;
      for (char c : express.substring(1).toCharArray()) {
        if (c == ' ') {
          if (topIndex < top.length) {
            top[topIndex] = sb.toString();
            topIndex++;
            countWords++;
          } else if (countWords <= endIndex) {
            reverse[reverseIndex] = sb.toString();
            reverseIndex++;
            countWords++;
          } else if (countWords > endIndex) {
            tail[tailIndex] = sb.toString();
            tailIndex++;
            countWords++;
          }
          sb = new StringBuilder();
        } else {
          sb.append(String.valueOf(c));
        }
      }
      tail[tailIndex] = sb.toString();
      if (countWords < endIndex) {
        System.out.println("EMPTY");
        return;
      }

      // result
      StringBuilder result = new StringBuilder();
      for (String str : top) {
        result.append(str + " ");
      }
      for (int i = reverse.length - 1; i >= 0; i--) {
        result.append(reverse[i] + " ");
      }
      for (int i = 0; i < tail.length; i++) {
        if (tail[i] != null) {
          result.append(tail[i] + " ");
        }
      }
      System.out.println(result.toString());
    }
  }

  public static void case1(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[10];
    while (sc.hasNextLine()) {
      String str = sc.nextLine();
      String[] strs = str.split(" ");
      nums = new int[strs.length];
      for (int i = 0; i < strs.length; i++) {
        nums[i] = Integer.valueOf(strs[i]);
      }
    }

    int first = nums[0], second = nums[1], min = Math.abs(nums[0] + nums[1]);
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (Math.abs(nums[i] + nums[j]) < Math.abs(first + second)) {
          min = Math.abs(nums[i] + nums[j]);
          if (nums[i] < nums[j]) {
            first = nums[i];
            second = nums[j];
          } else {
            first = nums[j];
            second = nums[i];
          }
        }
      }
    }
    // result
    System.out.println(first + " " + second + " " + min);
  }


  public static void example1(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0, x;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        x = sc.nextInt();
        ans += x;
      }
    }
    System.out.println(ans);
  }

  public static void example2(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
      int a = in.nextInt();
      int b = in.nextInt();
      System.out.println(a + b);
    }
  }
}

