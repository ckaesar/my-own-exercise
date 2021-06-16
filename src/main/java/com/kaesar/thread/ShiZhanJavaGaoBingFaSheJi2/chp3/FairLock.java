package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 公平锁 示例
 *
 * @Author: chengk
 * @Date: 2021/6/13 3:09 下午
 */
public class FairLock implements Runnable {
    /**
     * 当设置公平锁时，两个线程基本上是交替获得锁，几乎不会发生同一个线程连续多次获得锁，从而保证了公平性。
     * 如果不适用公平锁，则很可能同一个线程连续多次获得锁。
     */
    public static ReentrantLock fairLock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {
                fairLock.lock();
                System.out.println(Thread.currentThread().getName() + "获得锁");
            } finally {
                fairLock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FairLock r1 = new FairLock();
        Thread t1 = new Thread(r1, "Thread_t1");
        Thread t2 = new Thread(r1, "Thread_t2");

        t1.start();
        t2.start();
    }
}
