package com.kaesar.jvm_zzm.chp8;

/**
 * 局部变量表Slot复用对垃圾收集的影响之二
 */
public class Example8_2 {
    /**
     * 在虚拟机运行参数中加上“-verbose:gc”来看看垃圾收集的过程，发现在System.gc()运行后并没有回收掉这64MB的内存。
     * 代码虽然已经离开了placeholder的作用域，但在此之后，再没有发生过任何对局部变量表的读写操作，placeholder原本所
     * 占用的变量槽还没有被其他变量所复用，所以作为GC Roots一部分的局部变量表仍然保持着对它的关联。
     *
     * @param args
     */
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        System.gc();
    }
}
