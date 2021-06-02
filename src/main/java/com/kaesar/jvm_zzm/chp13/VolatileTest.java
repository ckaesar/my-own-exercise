package com.kaesar.jvm_zzm.chp13;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic变量自增运算测试
 *
 * @Author: chengk
 * @Date: 2021/5/29 1:46 下午
 */
public class VolatileTest {
    public static AtomicInteger race = new AtomicInteger(0);

    public static void increase() {
        race.incrementAndGet();
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();

        }

        // 等待所有累加线程都结束
        while (Thread.activeCount() > 2) {
            System.out.println(Thread.activeCount());
            Thread.yield();
        }
        System.out.println(race);
    }
}
