package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch 使用示例
 *
 * @Author: chengk
 * @Date: 2021/6/22 8:20 下午
 */
public class CountDownLatchDemo implements Runnable {
    // 参数10表示需要10个线程完成任务后等待在 CountDownLatch 上的线程才能继续执行。
    static final CountDownLatch end = new CountDownLatch(10);
    static final CountDownLatchDemo demo = new CountDownLatchDemo();

    @Override
    public void run() {
        try {
            // 模拟检查任务
            Thread.sleep(new Random().nextInt(10) * 1000);
            System.out.println("check complete.");
            // 通知 CountDownLatch，一个线程已经完成了任务，倒计数器减1
            end.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(demo);
        }

        System.out.println("before check.");
        // 等待检查
        // 要求主线程等待所有检查任务全部完成，待10个任务全部完成后，主线程才能继续执行。
        end.await();
        System.out.println("after check.");

        // 发射火箭
        System.out.println("Fire.");
        executorService.shutdown();
    }
}
