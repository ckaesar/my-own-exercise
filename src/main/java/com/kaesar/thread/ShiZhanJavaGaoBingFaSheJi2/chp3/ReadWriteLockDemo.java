package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp3;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁 示例：验证可知，如果再系统中，读操作的次数远远大于写操作的次数，则读写锁可以发挥最大的功效，提升系统的性能。
 * 当使用 读写锁 时，耗时2s多；当不使用 读写锁 时，由于都是串行操作，耗时20s多
 *
 * @Author: chengk
 * @Date: 2021/6/22 8:03 下午
 */
public class ReadWriteLockDemo {
    private static Lock lock = new ReentrantLock();
    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static Lock readLock = readWriteLock.readLock();
    private static Lock writeLock = readWriteLock.writeLock();
    private int value;

    public Object handleRead(Lock lock) throws InterruptedException {
        try {
            lock.lock(); // 模拟读操作
            System.out.println("read something...");
            Thread.sleep(1000); // 读操作的耗时越多，读写锁的优势就越明显
            return value;
        } finally {
            lock.unlock();
        }
    }

    public void handleWrite(Lock lock, int index) throws InterruptedException {
        try {
            lock.lock(); // 模拟写操作
            System.out.println("write something...");
            Thread.sleep(1000);
            value = index;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();
        Runnable readRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    demo.handleRead(readLock);
                    // 可以把上面一行注释掉，然后把下面这行的注释取消，验证下不使用读写锁的场景
//                    demo.handleRead(lock);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable writeRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    demo.handleWrite(writeLock, new Random().nextInt());
                    // 可以把上面一行注释掉，然后把下面这行的注释取消，验证下不使用读写锁的场景
//                    demo.handleWrite(lock, new Random().nextInt());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int i = 0; i < 18; i++) {
            new Thread(readRunnable).start();
        }

        for (int i = 18; i < 20; i++) {
            new Thread(writeRunnable).start();
        }
    }
}
