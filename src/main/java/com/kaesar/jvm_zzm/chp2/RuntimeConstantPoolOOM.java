package com.kaesar.jvm_zzm.chp2;

import java.util.HashSet;
import java.util.Set;

/**
 * 运行时常量池导致的内存溢出异常
 * VM Args: -XX:PermSize=6M -XX:MaxPermSize=6M
 * 备注：请在JDK 6环境运行代码
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        // 使用Set保持着常量池引用，避免Full Gc回收常量池行为
        Set<String> set = new HashSet<>();
        // 在short范围足以让6MB的PermSize产生OOM了
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
