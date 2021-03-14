package com.kaesar.designpattern.zen.chp24;

public class Client24_5 {
    public static void main(String[] args) {
        // 声明主角
        Boy boy = new Boy();
        // 初始化当前状态
        boy.setState("心情很棒！");
        System.out.println("-----男孩现在的状态-----");
        System.out.println(boy.getState());
        // 需要记录下当前状态
        Memento memento = boy.createMemento();
        // 男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("\n-----男孩追女孩之后的状态-----");
        System.out.println(boy.getState());
        // 追女孩失败，恢复原状
        boy.restoreMemento(memento);
        System.out.println("\n-----男孩恢复后的状态-----");
        System.out.println(boy.getState());
    }
}
