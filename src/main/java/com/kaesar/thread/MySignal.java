package com.kaesar.thread;

/**
 * 通过共享对象通信
 */
public class MySignal {
  // 信号值
  protected boolean hasDataToProcess = false;

  public synchronized boolean hasDataToProcess() {
    return this.hasDataToProcess;
  }

  public synchronized void setHasDataToProcess(boolean hasData) {
    this.hasDataToProcess = hasData;
  }
}
