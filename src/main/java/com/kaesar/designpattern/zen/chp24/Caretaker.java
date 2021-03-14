package com.kaesar.designpattern.zen.chp24;

/**
 * 备忘录管理者
 */
public class Caretaker {
    // 备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
