package com.kaesar.thread;

/**
 * 继承 Thread
 */
public class MyThread extends Thread {

  public void run() {
    System.out.println("MyThread running");
  }

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();
    System.out.println("main running");

    Thread thread = new Thread() {
      @Override
      public void run() {
        System.out.println("thread running");
      }
    };
    thread.start();
  }
}
