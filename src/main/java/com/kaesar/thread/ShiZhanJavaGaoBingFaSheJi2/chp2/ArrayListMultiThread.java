package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

import java.util.ArrayList;

/**
 * 并发下的ArrayList是不安全的，运行可能有三种结果：
 *     <p>1.程序正常结束，而且结果正确，说明即使不安全，也未必会每次都表现出来
 *     <p>2.程序抛异常java.lang.ArrayIndexOutOfBoundsException，因为ArrayList在扩容过程中，内部一致性被破坏，但由于没有锁的保护，另外一个
 *     线程访问到来了不一致的内部状态，导致出现越界问题。
 *     <p>3.程序正常结束，但是结果不正确，这就是比较隐蔽的问题，所以要关注线程不安全的问题。
 *
 * <p>改进方法：使用线程安全的Vector代替Arraylist。见 {@link VectorMultiThread}
 *
 * @Author: chengk
 * @Date: 2021/6/11 6:53 上午
 */
public class ArrayListMultiThread {
    static ArrayList<Integer> a1 = new ArrayList<>(10);

    public static class AddThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                a1.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a1.size());
    }
}
