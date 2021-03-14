package com.kaesar.designpattern.zen.chp22;

import java.util.ArrayList;

public class HanFeiZi3 implements IHanFeiZi, Observable {
    // 定义个定长数组，存放所有的观察者
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        // 通知所有的观察者
        this.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        // 通知所有的观察者
        this.notifyObservers("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observers) {
            observer.update(context);
        }
    }
}
