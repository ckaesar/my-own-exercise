package com.kaesar.jvm_zzm.chp11;

/**
 * -XX:+PrintCompilation 的作用：要求虚拟机在即时编译时将被编译成本地代码的方法名称打 印出来
 * -XX:+PrintInlining 的作用：要求虚拟机输出方法内联信息
 * // 当添加 -XX:+PrintInlining 这个参数时，会报错：VM option 'PrintInlining' is diagnostic and must be enabled via -XX:+UnlockDiagnosticVMOptions.
 * // 需要在前面添加此参数
 * <p>
 * -XX:PrintIdealGraphLevel=2 -XX:PrintIdeal-GraphFile=ideal.xml
 * 当添加上面的参数时，会报错：VM option 'PrintIdealGraphLevel' is develop and is available only in debug version of VM.
 *
 * @Author: chengk
 * @Date: 2021/5/24 8:36 下午
 */
public class Test11_2 {
    public static final int NUM = 15000;

    public static int doubleValue(int i) {
        // 这个空循环用于后面演示JIT代码优化过程
        for (int j = 0; j < 100000; j++) {

        }
        return i * 2;
    }

    public static long calcSum() {
        long sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += doubleValue(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i < NUM; i++) {
            calcSum();
        }
    }

    public void log() {
        
    }
}
