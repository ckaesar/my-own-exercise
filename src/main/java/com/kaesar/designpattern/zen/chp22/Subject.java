package com.kaesar.designpattern.zen.chp22;

import com.kaesar.designpattern.zen.chp17.AbstractDecorator;

import java.util.Vector;

/**
 * 被观察者抽象类
 */
public abstract class Subject {
    // 定义一个观察者数组
    private Vector<AbstractObserver> observerVector = new Vector();

    /**
     * 增加一个观察者
     *
     * @param observer
     */
    public void addObserver(AbstractObserver observer) {
        this.observerVector.add(observer);
    }

    public void deleteObserver(AbstractObserver observer) {
        this.observerVector.remove(observer);
    }

    // 通知所有的观察者
    public void notifyObservers() {
        for (AbstractObserver observer : observerVector) {
            observer.update();
        }
    }
}
