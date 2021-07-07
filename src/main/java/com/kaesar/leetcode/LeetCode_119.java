package com.kaesar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> one = new ArrayList<>();
        one.add(1);
        if (rowIndex == 0) {
            return one;
        }
        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        if (rowIndex == 1) {
            return two;
        }
        List<Integer> last = two;
        List<Integer> cur = new ArrayList<>();
        for (int i = 2; i <= rowIndex; i++) {
            cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i; j++) {
                cur.add(last.get(j - 1) + last.get(j));
            }
            cur.add(1);
            last = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        for (Integer integer : getRow(3)) {
            System.out.print(integer + " ");
        }
    }
}
