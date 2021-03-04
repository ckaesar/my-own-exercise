package com.kaesar.designpattern.zen.chp18;

/**
 * 高层模块
 */
public class Client18_10 {
    public static void main(String[] args) {
        // 声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        // 生命一个上下文对象
        ContextRole context = new ContextRole(strategy);
        // 执行封装后的方法
        context.doAnything();
    }
}
