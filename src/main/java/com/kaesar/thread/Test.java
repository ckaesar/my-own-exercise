package com.kaesar.thread;

public class Test {
  public static void main(String[] args) {
    System.out.println();



    try {
      MyThread myThread = new MyThread();
      myThread.setName("myThread");
      myThread.start();
      for (int i = 0; i < 10; i++) {
        int time = (int) (Math.random() * 1000);
        Thread.sleep(time);
        System.out.println("run = " + Thread.currentThread().getName());
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}


class MyThread extends Thread {
  @Override
  public void run() {
    try {
      for (int i = 0; i < 10; i++) {
        int time = (int) (Math.random() * 1000);
        Thread.sleep(time);
        System.out.println("run = " + Thread.currentThread().getName());
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}