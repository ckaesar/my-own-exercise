package com.kaesar.algorithm4.exercise.chp2;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdRandom;

/**
 * 快速排序
 */
public class Quick extends Example {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a); // 消除对输入的依赖
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi); // 切分
        sort(a, lo, j - 1); // 将左半部分a[lo...j-1]排序
        sort(a, j + 1, hi); // 将有半部分a[j+1...hi]排序
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        // 将数组切分为a[lo...i-1], a[i], a[i+1...hi]
        int i = lo, j = hi + 1;
        Comparable v = a[lo]; // 切分元素
        while (true) {
            // 扫描左右，检查扫描是否结束并交换元素
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j); // 将v = a[j]放入正确的位置
        return j; // a[lo...j-1] <= a[j] <= a[j+1...hi]达成
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
