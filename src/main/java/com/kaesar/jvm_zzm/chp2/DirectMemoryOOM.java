package com.kaesar.jvm_zzm.chp2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 使用unsafe分配本机内存
 * VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 * 直接内存的容量大小可以通过 -XX: MaxDirectMemorySize 参数来指定
 * 如果不指定，则默认与Java堆最大值（由-Xmx指定）一致
 */
public class DirectMemoryOOM {
    private static final int _1M = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1M);
        }
    }
}
