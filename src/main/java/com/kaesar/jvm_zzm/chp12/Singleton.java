package com.kaesar.jvm_zzm.chp12;

/**
 * 双锁检测单例（Double Check Lock，DCL）
 *
 * @Author: chengk
 * @Date: 2021/5/29 2:06 下午
 */
public class Singleton {
    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
