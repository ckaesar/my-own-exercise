package com.kaesar.jvm_zzm.chp2;

/**
 * 虚拟机栈和本地方法栈测试
 * 备注：线程请求的栈深度大于虚拟机栈所允许的最大深度，抛出 StackOverflowError
 * VM Args: -Xss128k
 */
public class JavaVMStackSOF {
  private int stackLength = 1;

  public void stackLeak() {
    stackLength++;
    stackLeak();
  }

  public static void main(String[] args) throws Throwable {
    JavaVMStackSOF oom = new JavaVMStackSOF();
    try {
      oom.stackLeak();
    } catch (Throwable e) {
      System.out.println("stack length: " + oom.stackLength);
      throw e;
    }
  }
}
