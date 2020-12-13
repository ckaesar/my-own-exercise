package com.kaesar.thread;

public class VolatileTest3 {
  public int inc = 0;

  public synchronized void increase() {
    inc++;
  }

  public static void main(String[] args) {
    final VolatileTest3 volatileTest2 = new VolatileTest3();
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
