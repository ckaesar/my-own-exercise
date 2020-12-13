package com.kaesar.test;

/**
 * Jstack 进程id > 快照文件名
 * 例如： jstack 22242 > ./deadlock.txt
 * 用于生成java虚拟机当前时刻的线程快照
 */
public class DeadLock {

  private static Object lock1 = new Object();
  private static Object lock2 = new Object();

  public static void main(String[] args) {
    new Thread(() -> {
      synchronized (lock1) {
        try {
          System.out.println("thread1 start");
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (lock2) {
          System.out.println("thread1 end");
        }
      }
    }).start();

    new Thread(() -> {
      synchronized (lock2) {
        try {
          System.out.println("thread2 start");
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (lock1) {
          System.out.println("thread2 end");
        }
      }
    }).start();

    System.out.println("The end");
  }
}
