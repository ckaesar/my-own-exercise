package com.kaesar.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VolatileTest4 {
  public int inc = 0;
  Lock lock = new ReentrantLock();

  public void increase() {
    lock.lock();
    try {
      inc++;
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public static void main(String[] args) {
    final VolatileTest4 volatileTest2 = new VolatileTest4();
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
