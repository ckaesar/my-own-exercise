package com.kaesar.designpattern.zen.chp24;

public class Client24_7 {
    public static void main(String[] args) {
        // 声明主角
        Boy boy = new Boy();
        // 声明出备忘录的管理者
        Caretaker caretaker = new Caretaker();
        // 初始化当前状态
        boy.setState("心情很棒！");
        System.out.println("-----男孩现在的状态-----");
        System.out.println(boy.getState());
        // 需要记录下当前状态
        caretaker.setMemento(boy.createMemento());
        // 男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("\n-----男孩追女孩之后的状态-----");
        System.out.println(boy.getState());
        // 追女孩失败，恢复原状
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("\n-----男孩恢复后的状态-----");
        System.out.println(boy.getState());
    }
}
