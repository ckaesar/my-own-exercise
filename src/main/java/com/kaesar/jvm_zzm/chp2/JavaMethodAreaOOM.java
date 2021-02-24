package com.kaesar.jvm_zzm.chp2;

/**
 * 借助CGLib使得方法区出现内存溢出异常
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class JavaMethodAreaOOM {
    public static void main(String[] args) {
        while (true) {
            // TODO: 2021/2/22
        }
    }
}
