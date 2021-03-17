package com.kaesar.designpattern.zen.chp24;

/**
 * 备忘录管理者
 */
public class Caretaker3 {
    // 备忘录对象
    private Memento3 memento;

    public Memento3 getMemento() {
        return memento;
    }

    public void setMemento(Memento3 memento) {
        this.memento = memento;
    }
}
