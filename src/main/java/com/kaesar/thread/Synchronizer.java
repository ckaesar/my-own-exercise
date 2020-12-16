package com.kaesar.thread;


public class Synchronizer {
  // 同步代码块
  public synchronized void doSynchronized() {
    // do a lot of work which takes a long time
  }

  // 为了提高线程的公平性，用锁的方式来代替代码块
  LockJava lock = new LockJava();

  public void doSynchronized1() throws InterruptedException {
    this.lock.lock();
    // critical section, do a lot of work which takes a long time
    this.lock.unlock();
  }
}
