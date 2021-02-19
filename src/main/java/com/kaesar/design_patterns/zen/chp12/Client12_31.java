package com.kaesar.design_patterns.zen.chp12;

public class Client12_31 {
    public static void main(String[] args) {
        // 定义一个主题
        Subject2 subject2 = new RealSubject2();
        // 定义一个主题的代理
        Subject2 proxy = SubjectDynamicProxy.newProxyInstance(subject2);
        // 代理的行为
        proxy.doSomething("Finish");
    }
}
