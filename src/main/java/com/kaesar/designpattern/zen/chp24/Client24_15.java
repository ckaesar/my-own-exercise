package com.kaesar.designpattern.zen.chp24;

public class Client24_15 {
    public static void main(String[] args) {
        // 定义发起人
        Originator2 originator2 = new Originator2();
        // 建立初始状态
        originator2.setState("初始状态是...");
        System.out.println("初始状态是：" + originator2.getState());
        // 建立备份
        originator2.createMemento();
        // 修改状态
        originator2.setState("修改后的状态是...");
        System.out.println("修改后的状态是：" + originator2.getState());
        // 恢复原有状态
        originator2.restoreMemento();
        System.out.println("恢复后状态是：" + originator2.getState());
    }
}
