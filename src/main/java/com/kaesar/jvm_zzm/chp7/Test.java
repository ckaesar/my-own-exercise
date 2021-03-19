package com.kaesar.jvm_zzm.chp7;

/**
 * 非法向前引用变量
 */
public class Test {
    static {
        i = 2; // 可以给在它之后定义的变量赋值
//        System.out.println(i); // 不能使用在它之后定义的变量，编译器会提示 Illegal forward reference (非法向前引用)
    }

    static int i = 1;
}
