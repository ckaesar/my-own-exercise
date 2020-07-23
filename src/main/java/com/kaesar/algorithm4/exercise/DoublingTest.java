package com.kaesar.algorithm4.exercise;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdRandom;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.ThreeSum;

public class DoublingTest {
    public static double timeTrial(int N) {
        // 为处理N个随机的六位整数的ThreeSum.count()计时
        int MAX = 1000000;
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        // 打印运行时间的表格
        for(int N = 250; true; N += N) {
            // 打印时间规模为N时程序的用时
            double time = timeTrial(N);
            StdOut.printf("%7d %5.1f\n", N, time);
        }
    }

}
