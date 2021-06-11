package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 重入锁 ReentrantLock 示例。可重入锁是在一个线程内是可以多次进入的，但是要记住，获取了几次锁，就要释放几次锁，不然线程结束无法释放资源。
 *
 * @Author: chengk
 * @Date: 2021/6/11 7:30 上午
 */
public class ReenterLock implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();

    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            lock.lock();
            try {
                i++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock reenterLock = new ReenterLock();
        Thread t1 = new Thread(reenterLock);
        Thread t2 = new Thread(reenterLock);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
