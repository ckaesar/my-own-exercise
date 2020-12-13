package com.kaesar.thread;

public class Counter {
  protected long count = 0;

  public void add(long value) {
    this.count = this.count + value;
  }

  public static void main(String[] args) {
    Counter counter = new Counter();
    Thread thread1 = new Thread("thread1 name") {
      @Override
      public void run() {
        counter.add(20);
        System.out.println(Thread.currentThread().getName() + " " + counter.count);
      }
    };
    Thread thread2 = new Thread("thread2 name") {
      @Override
      public void run() {
        counter.add(30);
        System.out.println(Thread.currentThread().getName() + " " + counter.count);
      }
    };
    thread1.start();
    thread2.start();
    System.out.println(Thread.currentThread().getName() + " " + counter.count);
  }
}
