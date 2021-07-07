package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        result.add(one);
        if (numRows == 1) {
            return result;
        }
        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        result.add(two);
        if (numRows == 2) {
            return result;
        }
        for (int i = 3; i <= numRows; i++) {
            List<Integer> lastOne = result.get(result.size() - 1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 2; j < i; j++) {
                cur.add(lastOne.get(j - 2) + lastOne.get(j - 1));
            }
            cur.add(1);
            result.add(cur);
        }
        return result;
    }

    public static void main(String[] args) {
        for (List<Integer> integers : generate(5)) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
