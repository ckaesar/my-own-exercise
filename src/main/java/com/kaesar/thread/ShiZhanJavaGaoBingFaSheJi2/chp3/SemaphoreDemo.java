package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Semaphore 示例
 *
 * @Author: chengk
 * @Date: 2021/6/18 1:16 下午
 */
public class SemaphoreDemo implements Runnable {
    // 生命一个包含5个许可的信号量，表示同时可以有5个线程执行acquire()并获得锁
    final Semaphore semaphore = new Semaphore(5);

    @Override
    public void run() {
        try {
            semaphore.acquire();
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + ":done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 在离开时，必须使用release()方法释放信号量
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        final SemaphoreDemo semaphoreDemo = new SemaphoreDemo();
        for (int i = 0; i < 20; i++) {
            executorService.submit(semaphoreDemo);
        }
    }
}
