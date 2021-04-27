package com.kaesar.designpattern.zen.chp26;

public class Client26_17 {
    public static void main(String[] args) {
        // 定义环境角色
        ChangeContext context = new ChangeContext();
        // 初始化状态
        context.setCurrentState(ChangeContext.STATE1);
        // 行为执行
        context.handle1();
        context.handle2();
    }
}
