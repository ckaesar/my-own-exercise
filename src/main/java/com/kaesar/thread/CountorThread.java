package com.kaesar.thread;

public class CountorThread extends Thread {
  protected Countor countor = null;

  public CountorThread(Countor countor) {
    this.countor = countor;
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      countor.add(i);
      System.out.println(Thread.currentThread().getName() + " : "  + countor.count);
    }
  }
}
