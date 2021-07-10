package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_202 {
    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        List<Integer> appearedNums = new ArrayList<>();
        int num = n;
        while (!appearedNums.contains(num)) {
            appearedNums.add(num);
            int sum = 0;
            for (char c : String.valueOf(num).toCharArray()) {
                int cur = Integer.valueOf(String.valueOf(c));
                sum += cur * cur;
            }
            if (sum == 1) {
                return true;
            } else {
                num = sum;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
