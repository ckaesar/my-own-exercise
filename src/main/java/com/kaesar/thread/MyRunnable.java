package com.kaesar.thread;

/**
 * 继承 Runnable 接口
 */
public class MyRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println("Runnable running");
  }

  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
    System.out.println("main runnable");

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("runnable in running");
      }
    };
    Thread thread1 = new Thread(runnable);
    thread1.start();

    MyRunnable runnable1 = new MyRunnable();
    Thread thread2 = new Thread(runnable1, "New Thread name");
    thread2.start();
    System.out.println(thread2.getName());
    System.out.println(Thread.currentThread().getName());
  }
}
