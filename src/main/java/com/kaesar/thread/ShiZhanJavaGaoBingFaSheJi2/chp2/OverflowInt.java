package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

/**
 * int溢出，不报错
 *
 * @Author: chengk
 * @Date: 2021/6/11 6:51 上午
 */
public class OverflowInt {
    public static void main(String[] args) {
        int v1 = 1073741827, v2 = 1431655768;

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        // v1 + v2 的结果导致int的溢出
        int average = (v1 + v2) / 2;
        System.out.println("average = " + average);
    }
}
