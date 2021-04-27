package com.kaesar.jvm_zzm.chp8;

/**
 * 未赋值的局部变量
 */
public class Example8_4 {
    public static void main(String[] args) {
        int a;
//        System.out.println(a);
        // 这里a没有赋值，直接使用会报错
    }
}
