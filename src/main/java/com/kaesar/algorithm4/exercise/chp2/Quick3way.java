package com.kaesar.algorithm4.exercise.chp2;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdRandom;

/**
 * 三向切分的快速排序
 */
public class Quick3way extends Example {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a); // 消除对输入的依赖
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                exch(a, i, gt--);
            } else {
                i++;
            }
        } // 现在a[lo...lt-1] < v = a[lt...gt] < a[gt+1...hi]成立
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
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
