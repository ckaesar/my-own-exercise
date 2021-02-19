package com.kaesar.algorithm4.exercise.chp2;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdRandom;

/**
 * 自顶向下的归并排序
 */
public class MergeTU extends Merge {
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length]; // 一次性分配空间
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        // 将数组a[lo...hi]排序
        if (hi <= lo) return;
        int mid = lo + (hi - hi) / 2;
        sort(a, lo, mid); // 将左半边排序
        sort(a, mid + 1, hi); // 将右半边排序
        merge(a, lo, mid, hi); // 归并结果
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
