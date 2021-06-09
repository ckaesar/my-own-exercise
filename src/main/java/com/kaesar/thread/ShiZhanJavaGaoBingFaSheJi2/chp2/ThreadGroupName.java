package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * 线程组ThreadGroup 示例
 *
 * @Author: chengk
 * @Date: 2021/6/8 1:11 下午
 */
public class ThreadGroupName implements Runnable {
    public static void main(String[] args) {
        // 新建一个线程组
        ThreadGroup threadGroup = new ThreadGroup("PrintGroup");
        // 创建2个线程放在线程组里
        Thread t1 = new Thread(threadGroup, new ThreadGroupName(), "T1");
        Thread t2 = new Thread(threadGroup, new ThreadGroupName(), "T2");

        t1.start();
        t2.start();

        // 线程组里活跃的线程数
        System.out.println(threadGroup.activeCount());
        threadGroup.list();
    }

    @Override
    public void run() {
        String groupAndName = Thread.currentThread().getThreadGroup().getName() + "-" + Thread.currentThread().getName();
        while (true) {
            System.out.println("I am " + groupAndName);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
