package com.kaesar.thread;

public class VolatileTest2 {
  public int inc = 0;

  public void increase() {
    inc++;
  }

  public static void main(String[] args) {
    final VolatileTest2 volatileTest2 = new VolatileTest2();
    for (int i = 0; i < 5; i++) {
      new Thread() {
        @Override
        public void run() {
          for (int j = 0; j < 10; j++) {
            volatileTest2.increase();
          }
        }
      }.start();
    }

    while (Thread.activeCount() > 1) { // 保证前面的线程都执行完
      Thread.yield();
    }
    System.out.println(volatileTest2.inc);
  }
}
