package com.kaesar.algorithm4.exercise.chp2;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.*;
import com.kaesar.algorithm4.exercise.chp1.Stopwatch;

/**
 * 比较各种排序算法
 */
public class SortCompare {
    public static double time(String alg, Comparable[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) {
            Insertion.sort(a);
        }
        if (alg.equals("Selection")) {
            Selection.sort(a);
        }
        if (alg.equals("Shell")) {
            Shell.sort(a); // TODO: 2021/2/2
        }
        if (alg.equals("Merge")) {
            Merge.sort(a); // TODO: 2021/2/2
        }
        if (alg.equals("Quick")) {
            Quick.sort(a); // TODO: 2021/2/2
        }
        if (alg.equals("Heap")) {
            Heap.sort(a); // TODO: 2021/2/2
        }
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        // 使用算法alg将T个长度为N的数组排序
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            //进行一次测试（生成一个数组并排序）
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = "Insertion";
        String alg2 = "Selection";
        int N = 100000; // 数组长度
        int T = 10; // 次数
        double t1 = timeRandomInput(alg1, N, T); // 算法1的总时间
        double t2 = timeRandomInput(alg2, N, T); // 算法2的总时间
        StdOut.printf("t1=%.1f \t t2=%.1f\n", t1, t2);
        StdOut.printf("For %d random Doubles\n    %s is", N, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2 / t1, alg2);
    }
}
