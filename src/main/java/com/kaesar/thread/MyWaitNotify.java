package com.kaesar.thread;

public class MyWaitNotify {
  MonitorObject myMonitorObject;

  public MyWaitNotify(MonitorObject monitorObject) {
    this.myMonitorObject = monitorObject;
  }

  public void doWait() {
    synchronized (myMonitorObject) {
      try {
        System.out.println("before wait");
        myMonitorObject.wait();
        System.out.println("end wait");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void doNotify() {
    synchronized (myMonitorObject) {
      System.out.println("before notify");
      myMonitorObject.notify();
      System.out.println("after notify");
    }
  }

  public static void main(String[] args) {
    try {
      MyWaitNotify myWaitNotify = new MyWaitNotify(new MonitorObject());
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
