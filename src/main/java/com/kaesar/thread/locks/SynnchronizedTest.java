package com.kaesar.thread.locks;

public class SynnchronizedTest {
    public synchronized void method1() {
        // 方法同步
    }

    public void method2() {
        synchronized (this.getClass()) {
            // 块同步
        }
    }

    public void method3() {
        synchronized (this) {
            // 块同步
        }
    }

    public static synchronized void method4() {
        // 类同步
    }

    // method1等同于method3，method2等同于method4
}
