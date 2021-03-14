package com.kaesar.designpattern.zen.chp22;

/**
 * 具体被观察者
 */
public class ConcreteSubject extends Subject {
    // 具体的业务
    public void doSomething() {
        /**
         * do something
         */
        super.notifyObservers();
    }
}
