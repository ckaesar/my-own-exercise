package com.kaesar.jvm_zzm.chp3;

/**
 * 大对象直接进入老年代
 * -XX:PretenureSizeThreshold=3145728 表示但对象大于 3MB 时，直接进入老年代
 * 参数只对Serial和ParNew两款新生代收集器有效
 */
public class BigObject {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数： -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     */
    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB]; // 直接分配在老年代中
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
