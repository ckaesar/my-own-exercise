package com.kaesar.jvm_zzm.chp4;

/**
 * JConsole监控
 * 死锁样例代码
 */
public class DeadLockTest {
    /**
     * 线程死锁等待演示
     */
    static class SynAddRunnablle implements Runnable {
        int a, b;

        public SynAddRunnablle(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)) {
                synchronized (Integer.valueOf(b)) {
                    System.out.println(a + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(new SynAddRunnablle(1, 2)).start();
            new Thread(new SynAddRunnablle(2, 1)).start();
        }
    }
}
