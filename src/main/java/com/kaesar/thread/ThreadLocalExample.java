package com.kaesar.thread;

import com.sun.org.apache.xml.internal.security.Init;

public class ThreadLocalExample {

  private ThreadLocal threadLocal = new ThreadLocal();

  private ThreadLocal<String> threadLocal2 = new ThreadLocal<>();

  private ThreadLocal<String> myThreadLocal = new ThreadLocal() {
    @Override
    protected Object initialValue() {
      return "This is a initial value.";
    }
  };

  public static void main(String[] args) {
    ThreadLocalExample example = new ThreadLocalExample();

    System.out.println("main: " + example.threadLocal2.get());
    example.threadLocal2.set("main local string");
    String local = example.threadLocal2.get();
    System.out.println("main: " + local);

    System.out.println("myThreadLocal in main: " + example.myThreadLocal.get());

    new Thread() {
      @Override
      public void run() {
        System.out.println("thread1: " + example.threadLocal.get());
        example.threadLocal.set("thread1 local");
        System.out.println("thread1: " + example.threadLocal.get());
        System.out.println("myThreadLocal in thread1: " + example.myThreadLocal.get());
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        System.out.println("thread2: " + example.threadLocal.get());
        example.threadLocal.set("thread2 local");
        System.out.println("thread2: " + example.threadLocal.get());
        example.myThreadLocal.set("changed");
        System.out.println("myThreadLocal in thread2: " + example.myThreadLocal.get());
      }
    }.start();
  }
}
