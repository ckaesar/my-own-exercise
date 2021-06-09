package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * 守护线程：当用户线程全部结束之后，守护线程就结束了
 *
 * @Author: chengk
 * @Date: 2021/6/8 1:20 下午
 */
public class DaemonDemo {
    public static class DaemonT extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("I am alive.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new DaemonT();
        // 将线程t设置为守护线程
        t.setDaemon(true);
        t.start();

        Thread.sleep(2000);
    }
}
