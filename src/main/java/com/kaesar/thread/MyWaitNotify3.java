package com.kaesar.thread;

public class MyWaitNotify3 {
  MonitorObject myMonitorObject;
  boolean wasSignaled = false;

  public MyWaitNotify3(MonitorObject monitorObject) {
    this.myMonitorObject = monitorObject;
  }

  public void doWait() {
    synchronized (myMonitorObject) {
      try {
        System.out.println("before wait");
        while (!wasSignaled) {
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
      MyWaitNotify3 myWaitNotify = new MyWaitNotify3(new MonitorObject());
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
