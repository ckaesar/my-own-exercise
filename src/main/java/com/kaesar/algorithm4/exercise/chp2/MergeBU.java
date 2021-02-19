package com.kaesar.algorithm4.exercise.chp2;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdRandom;

/**
 * 自底向上的归并排序
 */
public class MergeBU extends Merge {
    public static void sort(Comparable[] a) {
        // 进行lgN次两两归并
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) { // sz子数组大小
            for (int lo = 0; lo < N - sz; lo += sz + sz) { // lo: 子数组索引
                Merge.merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
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
