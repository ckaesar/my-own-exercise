package com.kaesar.thread;

/**
 * 忙等待（Busy Wait）
 */
public class MySignal2 {
  // 信号值
  protected boolean hasDataToProcess = false;

  public synchronized boolean hasDataToProcess() {
    return this.hasDataToProcess;
  }

  public synchronized void setHasDataToProcess(boolean hasData) {
    this.hasDataToProcess = hasData;
  }

  // 准备处理数据的线程B正在等待数据变为可用。换句话说，它在等待线程A的一个信号，这个信号使hasDataToProcess()返回true。
  // 线程B运行在一个循环里，以等待这个信号
  public void busyWait() {
    while(!hasDataToProcess) {
      // do nothing... busy waiting
    }
  }

  public static void main(String[] args) {

  }
}
