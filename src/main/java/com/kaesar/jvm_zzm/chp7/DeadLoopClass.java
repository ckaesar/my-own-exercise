package com.kaesar.jvm_zzm.chp7;


/**
 * 由于static里面的语句执行时间太长，一个线程开始执行，会阻塞另一个线程初始化类
 */
public class DeadLoopClass {
    static {
        // 如果不加上这个if语句，编译器将提示“Initializer does not complete normally” 并拒绝编译
        if (true) {
            System.out.println(Thread.currentThread() + "init DeadLoopClass");
            while (true) {

            }
        }
    }

    public static void main(String[] args) {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "start");
                DeadLoopClass dlc = new DeadLoopClass();
                System.out.println(Thread.currentThread() + "run over");
            }
        };

        Thread thread1 = new Thread(script);
        Thread thread2 = new Thread(script);
    }
}
