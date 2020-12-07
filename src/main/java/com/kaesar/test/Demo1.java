package com.kaesar.test;

import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {
  public static void main(String[] args) {
    Demo1 demo1 = new Demo1();
    demo1.test();
  }

  public synchronized void test() {
    System.out.println("test synchronized");
    ReentrantLock reentrantLock = new ReentrantLock();
  }
}
