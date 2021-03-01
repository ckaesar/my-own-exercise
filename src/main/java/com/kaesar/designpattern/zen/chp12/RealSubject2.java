package com.kaesar.designpattern.zen.chp12;

public class RealSubject2 implements Subject2 {
    // 业务操作
    @Override
    public void doSomething(String str) {
        System.out.println("do something!----->" + str);
    }
}
