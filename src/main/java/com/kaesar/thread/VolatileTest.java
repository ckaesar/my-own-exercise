package com.kaesar.thread;

public class VolatileTest {
  public volatile boolean stop = false;

  public static void main(String[] args) {
    VolatileTest volatileTest = new VolatileTest();

    new Thread() {
      @Override
      public void run() {
        volatileTest.stop = false;
        try {
          Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        while (!volatileTest.stop) {
          System.out.println("thread1, stop = " + volatileTest.stop);
        }
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        volatileTest.stop = true;
        System.out.println("thread2, stop = " + volatileTest.stop);
      }
    }.start();
  }
}
