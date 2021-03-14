package com.kaesar.designpattern.zen.chp22;

public class ConcreteObserver implements AbstractObserver {
    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
}
