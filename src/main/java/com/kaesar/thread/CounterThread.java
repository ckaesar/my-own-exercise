package com.kaesar.thread;

public class CounterThread {
  private int count = 0;

  public int inc() {
    synchronized (this) {
      return ++count;
    }
  }
}
