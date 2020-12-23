package com.kaesar.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {
  private Lock lock = new ReentrantLock();
  private int count = 0;

  public int inc() {
    lock.lock();
    int newCount = ++count;
    lock.unlock();
    return newCount;
  }
}
