package com.kaesar.algorithm4.exercise.chp2;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdRandom;

/**
 * 归并排序基础类
 */
public class Merge extends Example {
    protected static Comparable[] aux; // 归并所需的辅助数组

    /**
     * 原地归并的抽象方法
     *
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        // 将a[lo...mid] 和 a[mid+1...hi] 归并
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            // 将a[lo...hi]复制到aux[lo...hi]
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            // 归并到a[lo...hi]
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
