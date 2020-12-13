package com.kaesar.thread;

/**
 * 对象成员存储在堆上，如果两个线程同时更新同一个对象的同一个成员，那这个代码就不是线程安全的
 */
public class NotThreadSafe {
  StringBuilder builder = new StringBuilder();

  public void add(String text) {
    this.builder.append(text);
  }

  public static void main(String[] args) {
    NotThreadSafe sharedInstance = new NotThreadSafe();

    new Thread(new NotThreadSafeRunnable(sharedInstance)).start();
    System.out.println(sharedInstance.builder);
    new Thread(new NotThreadSafeRunnable(sharedInstance)).start();
    System.out.println(sharedInstance.builder);
  }
}
