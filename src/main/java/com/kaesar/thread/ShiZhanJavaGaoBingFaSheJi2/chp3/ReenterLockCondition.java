package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition示例
 *
 * @Author: chengk
 * @Date: 2021/6/16 1:13 下午
 */
public class ReenterLockCondition implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("t1: Threading is starting.");
            condition.await();
            System.out.println("t1: Threading is going on.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLockCondition reenterLockCondition = new ReenterLockCondition();
        Thread t1 = new Thread(reenterLockCondition);
        t1.start();
        Thread.sleep(2000);
        // 通知线程t1继续执行
        lock.lock();
        condition.signal();
        System.out.println("Main: after signal.");
        Thread.sleep(2000);
        System.out.println("Main: after sleep.");
        // 释放锁后，接收到signal通知的线程才能继续执行
        lock.unlock();
    }
}
