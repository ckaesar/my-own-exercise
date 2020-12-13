package com.kaesar.thread;

public class NotThreadSafeRunnable implements Runnable {
  NotThreadSafe instance = null;

  public NotThreadSafeRunnable(NotThreadSafe instance) {
    this.instance = instance;
  }

  @Override
  public void run() {
    this.instance.add("some text");
  }
}
