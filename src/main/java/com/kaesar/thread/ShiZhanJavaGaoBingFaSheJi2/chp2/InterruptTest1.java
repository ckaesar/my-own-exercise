package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * 线程中断测试
 *
 * @Author: chengk
 * @Date: 2021/6/4 8:48 下午
 */
public class InterruptTest1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interrupted.");
                        break;
                    }
                    System.out.println("running");
                    Thread.yield();
                }
            }
        };
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
