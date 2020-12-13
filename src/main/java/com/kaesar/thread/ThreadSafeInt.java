package com.kaesar.thread;

public class ThreadSafeInt {
  public void someMethod() {
    long threadSafeInt = 0;
    threadSafeInt++;
  }

  public void someMethod1() {
    LocalObject localObject = new LocalObject();
    localObject.callMethod();
    method2(localObject);
  }

  public void method2(LocalObject localObject) {
    localObject.setValue("value");
  }
}
