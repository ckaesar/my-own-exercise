package com.kaesar.thread;

public class MyWaitNotify2 {
  MonitorObject myMonitorObject;
  boolean wasSignaled = false;

  public MyWaitNotify2(MonitorObject monitorObject) {
    this.myMonitorObject = monitorObject;
  }

  public void doWait() {
    synchronized (myMonitorObject) {
      try {
        System.out.println("before wait");
        if (!wasSignaled) {
          myMonitorObject.wait();
        }
        wasSignaled = false;
        System.out.println("end wait");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void doNotify() {
    synchronized (myMonitorObject) {
      wasSignaled = true;
      System.out.println("before notify");
      myMonitorObject.notify();
      System.out.println("after notify");
    }
  }

  public static void main(String[] args) {
    try {
      MyWaitNotify2 myWaitNotify = new MyWaitNotify2(new MonitorObject());
      myWaitNotify.doWait();
      System.out.println("before sleep");
      Thread.sleep(3000);
      System.out.println("after sleep");
      myWaitNotify.doNotify();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
