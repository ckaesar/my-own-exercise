package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

import java.util.HashMap;
import java.util.Map;

/**
 * 并发下的HashMap也是不安全的
 * 预期结果是100000，但是运行时可能出现三种情况：
 * <p>1.程序正常结果，结果也是符合预期的，说明不安全也不是每次都发生。
 * <p>2.程序正常结束，但是结果不符合预期，打印的结果小于100000。
 * <p>3.程序永远无法结束。
 *
 * <p>改进方法：使用线程安全的{@link java.util.concurrent.ConcurrentHashMap}代替{@link HashMap}。见 {@link ConcurrentHashMapMultiThread}
 *
 * @Author: chengk
 * @Date: 2021/6/11 7:06 上午
 */
public class HashMapMultiThread {
    static Map<String, String> map = new HashMap<>();

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
        Thread t1 = new Thread(new HashMapMultiThread.AddThread(0));
        Thread t2 = new Thread(new HashMapMultiThread.AddThread(1));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(map.size());
    }
}
