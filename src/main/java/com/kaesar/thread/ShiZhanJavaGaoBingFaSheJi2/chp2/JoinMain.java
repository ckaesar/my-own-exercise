package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * join() 方法示例：join 的作用是阻塞当前线程，直到目标线程执行完毕，当前线程才能继续执行。
 *
 * @Author: chengk
 * @Date: 2021/6/8 7:09 上午
 */
public class JoinMain {
    public volatile static int i = 0;

    public static class AddThread extends Thread {
        @Override
        public void run() {
            System.out.println("enter AddThread");
            for (i = 0; i < 10000000; i++) {

            }
            System.out.println("out AddThread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddThread a = new AddThread();
        a.start();
        a.join();
        System.out.println("in Main");
        System.out.println(i);
    }
}
