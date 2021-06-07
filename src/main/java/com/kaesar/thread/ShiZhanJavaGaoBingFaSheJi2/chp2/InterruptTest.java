package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * 线程中断测试
 *
 * @Author: chengk
 * @Date: 2021/6/4 8:48 下午
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("running");
                    Thread.yield();
                }
            }
        };
        t1.start();
        Thread.sleep(2000);
        // 这种方式中断线程 没有效果
        t1.interrupt();
    }
}
