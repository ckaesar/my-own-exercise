package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock锁的申请等待限时示例
 *
 * @Author: chengk
 * @Date: 2021/6/11 9:57 上午
 */
public class TimeLock implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            // tryLock(5, TimeUnit.SECONDS) 方法，表示锁如果在等待时间内没有获取到锁，就自动放弃
            // 无参方法 tryLock() ，表示如果当前线程尝试获取锁，如果锁被其他线程占用，则立刻返回false
            if (lock.tryLock(5, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + ": get lock success.");
                Thread.sleep(6000);
            } else {
                System.out.println(Thread.currentThread().getName() + ": get lock failed.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        TimeLock timeLock = new TimeLock();
        Thread t1 = new Thread(timeLock);
        t1.setName("t1");
        Thread t2 = new Thread(timeLock);
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
