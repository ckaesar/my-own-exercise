package com.kaesar.designpattern.zen.chp26;

public abstract class State {
    // 定义一个环境角色，提供子类访问
    protected ChangeContext context;

    // 设置环境角色
    public void setContext(ChangeContext _context) {
        this.context = _context;
    }

    // 行为1
    public abstract void handle1();

    // 行为2
    public abstract void handle2();
}
