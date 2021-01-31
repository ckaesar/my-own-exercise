package com.kaesar.algorithm4.exercise.chp2;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.In;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdRandom;

/**
 * 选择排序
 */
public class Selection extends Example {
    public static void sort(Comparable[] a) {
        // 将 a[] 按升序排列
        int N = a.length; // 数组长度
        for (int i = 0; i < N; i++) {
            // 将a[i]和a[i+1..N]中最小的元素交换
            int min = i; // 最小元素的索引
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        String[] a = new String[100];
        for (int i = 0; i < 100; i++) {
            char x = (char) ('a' + (char) StdRandom.uniform(0, 26));
            char y = (char) ('a' + (char) StdRandom.uniform(0, 26));
            char z = (char) ('a' + (char) StdRandom.uniform(0, 26));
            a[i] = String.valueOf(x) + String.valueOf(y) + String.valueOf(z);
        }
        System.out.println("-----before sort-----");
        show(a);

        sort(a);
        assert isSorted(a);
        System.out.println("-----after sort-----");
        show(a);
    }
}
