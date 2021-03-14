package com.kaesar.designpattern.zen.chp22;

public class Client22_19 {
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 定义一个观察者
        AbstractObserver observer = new ConcreteObserver();
        // 观察者观察被观察者
        subject.addObserver(observer);
        // 被观察者开始活动了
        subject.doSomething();
    }
}
