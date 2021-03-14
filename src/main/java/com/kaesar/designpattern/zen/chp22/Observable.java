package com.kaesar.designpattern.zen.chp22;

/**
 * 被观察者接口
 */
public interface Observable {
    // 增加一个观察者
    public void addObserver(Observer observer);

    // 删除一个观察者
    public void deleteObserver(Observer observer);

    // 既然要观察，我发生改变了应该有所动作，通知观察者
    public void notifyObservers(String context);
}
