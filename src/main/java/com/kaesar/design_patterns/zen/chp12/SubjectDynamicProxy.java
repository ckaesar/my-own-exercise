package com.kaesar.design_patterns.zen.chp12;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject2 subject2) {
        // 获得ClassLoader
        ClassLoader loader = subject2.getClass().getClassLoader();
        // 获得接口组
        Class<?>[] classes = subject2.getClass().getInterfaces();
        // 获得handler
        InvocationHandler handler = new MyInvocationHandler(subject2);
        return newProxyInstance(loader, classes, handler);
    }
}
