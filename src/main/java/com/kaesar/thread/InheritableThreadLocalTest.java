package com.kaesar.thread;

public class InheritableThreadLocalTest extends Thread {
  public static InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

  public static void main(String[] args) throws InterruptedException {
    System.out.println("主线程开启");
    inheritableThreadLocal.set("主线程赋值");

    new InheritableThreadLocalTest().start();

    System.out.println("主线程休眠3s。。。。。");
    Thread.sleep(3000);
    System.out.println("主线程结束。。。。。");
  }

  @Override
  public void run() {
    System.out.println("子线程开启。。。。。");
    System.out.println("子线程获取本地变量值：" + inheritableThreadLocal.get());
    System.out.println("子线程结束。。。。。");
  }
}
