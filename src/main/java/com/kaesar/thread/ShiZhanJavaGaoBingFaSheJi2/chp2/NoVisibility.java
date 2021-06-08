package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * volatile 保证数据的可见性和有序性
 *
 * @Author: chengk
 * @Date: 2021/6/8 9:48 上午
 */
public class NoVisibility {
    private static volatile boolean ready;

    private static volatile int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready) {

            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(1000);
        number = 42;
        ready = true;
        Thread.sleep(10000);
    }
}
