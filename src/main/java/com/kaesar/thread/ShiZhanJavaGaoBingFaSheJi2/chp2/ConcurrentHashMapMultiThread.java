package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 线程安全的Map，得到的结果符合预期
 *
 * @Author: chengk
 * @Date: 2021/6/11 7:06 上午
 */
public class ConcurrentHashMapMultiThread {
    static Map<String, String> map = new ConcurrentHashMap<>();

    public static class AddThread implements Runnable {
        int start = 0;

        public AddThread(int start) {
            this.start = start;
        }

        @Override
        public void run() {
            for (int i = start; i < 100000; i += 2) {
                map.put(Integer.toString(i), Integer.toBinaryString(i));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ConcurrentHashMapMultiThread.AddThread(0));
        Thread t2 = new Thread(new ConcurrentHashMapMultiThread.AddThread(1));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(map.size());
    }
}
