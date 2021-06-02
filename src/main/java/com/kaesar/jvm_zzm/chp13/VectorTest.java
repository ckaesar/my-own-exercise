package com.kaesar.jvm_zzm.chp13;

import java.util.Vector;

/**
 * 对Vector线程安全的测试
 *
 * @Author: chengk
 * @Date: 2021/5/29 3:23 下午
 */
public class VectorTest {
    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 10; i++) {
                vector.add(i);
            }

            Thread removeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.remove(i);
                    }
                }
            });

            Thread printThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < vector.size(); i++) {
                        System.out.println(vector.get(i));
                    }
                }
            });

            removeThread.start();
            printThread.start();

            // 不要同时产生过多的线程，否则会导致操作系统假死
            while (Thread.activeCount() > 20) {

            }
        }
    }
}
