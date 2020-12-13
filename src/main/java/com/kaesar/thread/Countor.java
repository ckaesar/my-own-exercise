package com.kaesar.thread;

public class Countor {
  long count = 0;

  public synchronized void add(long value) {
    this.count += value;
  }
}
