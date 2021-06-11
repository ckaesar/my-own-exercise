package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * 线程不安全的示例： i++ 操作不具有原子性，如果是线程安全的，打印的结果应该是20000000，而事实上每次打印的结果都小于20000000
 *
 * @Author: chengk
 * @Date: 2021/6/11 6:20 上午
 */
public class AccountingVol implements Runnable {
    static AccountingVol instance = new AccountingVol();

    static volatile int i = 0;

    public static void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            increase();
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
