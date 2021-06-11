package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

import java.util.Vector;

/**
 * 将ArrayList换成Vector，变成线程安全的了。
 *
 * @Author: chengk
 * @Date: 2021/6/11 6:53 上午
 */
public class VectorMultiThread {
    static Vector<Integer> a1 = new Vector<>(10);

    public static class AddThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                a1.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a1.size());
    }
}
