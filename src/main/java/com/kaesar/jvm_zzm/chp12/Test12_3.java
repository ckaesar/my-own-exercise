package com.kaesar.jvm_zzm.chp12;

/**
 * volatile的使用场景
 *
 * @Author: chengk
 * @Date: 2021/5/29 1:56 下午
 */
public class Test12_3 {
    volatile boolean shutdownRequested;

    public void shutdown() {
        shutdownRequested = true;
    }

    public void doWork() {
        while (!shutdownRequested) {
            // 代码的业务逻辑
        }
    }
}
