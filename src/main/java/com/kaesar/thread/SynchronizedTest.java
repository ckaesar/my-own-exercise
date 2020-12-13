package com.kaesar.thread;

public class SynchronizedTest {

  private int count;
  private static int count1;

  // 静态方法同步
  public static synchronized void add1(int value) {
    count1 += value;
  }

  // 静态方法中的同步块
  public static void add3(int value) {
    synchronized (SynchronizedTest.class) {
      count1 += value;
    }
  }

  // 实例方法同步
  public synchronized void add(int value) {
    this.count += value;
  }

  // 实例方法中的同步块
  public void add2(int value) {
    synchronized (this) {
      this.count += value;
    }
  }

}
