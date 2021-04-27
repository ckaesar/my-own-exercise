package com.kaesar.jvm_zzm.chp8;

/**
 * 局部变量表槽复用对垃圾收集的影响之一
 */
public class Example8_1 {
    /**
     * 在虚拟机运行参数中加上“-verbose:gc”来看看垃圾收集的过程，发现在System.gc()运行后并没有回收掉这64MB的内存。
     * 因为在执行System.gc()时， 变量placeholder还处于作用域之内，虚拟机自然不敢回收掉placeholder的内存。
     *
     * @param args
     */
    public static void main(String[] args) {
        byte[] placeholder = new byte[64 * 1024 * 1024];
        System.gc();
    }
}
