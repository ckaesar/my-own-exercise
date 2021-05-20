package com.kaesar.jvm_zzm.chp9.shizhan;

import java.lang.reflect.Method;

/**
 * Javaclass执行工具
 *
 * @Author: chengk
 * @Date: 2021/5/19 8:36 下午
 */
public class JavaclassExecutor {
    /**
     * 执行外部传过来的代表一个Java类的Byte数组<br>
     * 将输入类的byte数组中代表java.lang.System的CONSTANT_UTF8_INFO常量修改为劫持后的HackSystem类
     * 执行方法为该类的static main(String[] args)方法，输出结果为该类向System.out/err输出的信息
     *
     * @param classByte 代表一个Java类的Byte数组
     * @return 执行结果
     */
    public static String execute(byte[] classByte) {
        HackSystem.clearBuffer();
        ClassModifier cm = new ClassModifier(classByte);
        byte[] modiBytes = cm.modifyUTF8Constant("java/lang/System", "org/fenisoft/classloading/execute/HackSystem");
        HotSwapClassLoader loader = new HotSwapClassLoader();
        Class clazz = loader.loadByte(modiBytes);
        try {
            Method method = clazz.getMethod("main", new Class[]{System[].class});
            method.invoke(null, new String[]{null});
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return HackSystem.getBufferString();
    }
}
