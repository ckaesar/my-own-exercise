package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * 创建线程
 *
 * @Author: chengk
 * @Date: 2021/6/4 9:52 上午
 */
public class CreateThread3 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Runnable.");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new CreateThread3());
        thread1.start();
        System.out.println("I am Main.");
    }
}
