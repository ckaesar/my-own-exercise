package com.kaesar.designpattern.zen.chp24;

/**
 * clone方式的备忘录
 */
public class Originator2 implements Cloneable {
    // 备忘录角色
    private Originator2 backup;

    // 内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备忘录
    public void createMemento() {
        backup = this.clone();
    }

    // 恢复一个备忘录
    public void restoreMemento() {
        this.setState(this.backup.getState());
    }

    @Override
    protected Originator2 clone() {
        try {
            return (Originator2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
