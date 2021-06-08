package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * volatile 测试： i++ 不具有原子性
 *
 * @Author: chengk
 * @Date: 2021/6/8 7:20 上午
 */
public class VolatileTest {
    static volatile int i = 0;

    public static class PlusTask implements Runnable {
        @Override
        public void run() {
            for (int k = 0; k < 10000; k++) {
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new PlusTask());
            threads[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }
        System.out.println(i);
    }
}
