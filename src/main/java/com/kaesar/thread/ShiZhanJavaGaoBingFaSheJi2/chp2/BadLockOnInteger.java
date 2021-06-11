package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * 错误的加锁示例
 *
 * @Author: chengk
 * @Date: 2021/6/11 7:19 上午
 */
public class BadLockOnInteger implements Runnable {
    public static Integer i = 0;

    static BadLockOnInteger instance = new BadLockOnInteger();

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            // synchronized (i) 对i加锁是不安全的，得不到预期的结果，因为Interger 的 i++，实际上是新创建了一个对象，所以这个锁是没用的
            synchronized (instance) {
                i++;
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
