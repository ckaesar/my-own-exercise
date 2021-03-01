package com.kaesar.designpattern.zen.chp12;

import java.lang.reflect.InvocationHandler;

public class Client12_29 {
    public static void main(String[] args) {
        // 定义一个主题
        Subject2 subject2 = new RealSubject2();
        // 定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject2);
        // 定义主题的代理
        Subject2 proxy = DynamicProxy.newProxyInstance(subject2.getClass().getClassLoader(), subject2.getClass().getInterfaces(), handler);
        // 代理的行为
        proxy.doSomething("Finish");
    }
}
