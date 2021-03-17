package com.kaesar.thread.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public interface Lock {
    void lock(); // 带阻塞效果

    void lockInterruptibly() throws InterruptedException; // 优先响应中断

    boolean tryLock(); // 无阻塞效果，可轮询

    boolean tryLock(long timeout, TimeUnit unit); // 可执行超时时间

    void unlock(); // 解锁

    Condition newCondition(); // 支持多条件
}
