package com.kaesar.designpattern.zen.chp18;

/**
 * 封装角色
 */
public class ContextRole {
    // 抽象策略
    private Strategy strategy = null;

    // 构造函数设置具体策略
    public ContextRole(Strategy _strategy) {
        this.strategy = _strategy;
    }

    // 封装后的策略方法
    public void doAnything() {
        this.strategy.doSomething();
    }
}
