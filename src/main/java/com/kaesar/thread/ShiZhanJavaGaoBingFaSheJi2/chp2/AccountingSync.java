package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * 线程安全的示例： 将synchronized关键字作用域给定对象instance上，因此每次当线程进入被关键字synchronized
 * 包括的代码段，就会要求请求instance实例的锁，这样就保证了只有一个线程执行 i++ 操作。
 *
 * @Author: chengk
 * @Date: 2021/6/11 6:20 上午
 */
public class AccountingSync implements Runnable {
    static AccountingSync instance = new AccountingSync();

    static volatile int i = 0;

    public static void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            synchronized (instance) {
                increase();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
