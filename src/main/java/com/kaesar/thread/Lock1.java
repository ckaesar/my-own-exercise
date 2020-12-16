package com.kaesar.thread;

public class Lock1 {
  protected MonitorObject monitorObject = new MonitorObject();
  protected boolean isLocked = false;

  public void lock() throws InterruptedException {
    synchronized (this) {
      while (isLocked) {
        synchronized (this.monitorObject) {
          this.monitorObject.wait();
        }
      }
      isLocked = true;
    }
  }

  public void unlock() {
    synchronized (this) {
      this.isLocked = false;
      synchronized (this.monitorObject) {
        this.monitorObject.notify();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Lock1 lock1 = new Lock1();

    new Thread() {
      @Override
      public void run() {
        try {
          lock1.isLocked = true;
          lock1.lock();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        lock1.unlock();
      }
    }.start();
  }
}
