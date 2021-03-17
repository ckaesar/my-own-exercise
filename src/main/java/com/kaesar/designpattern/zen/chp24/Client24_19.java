package com.kaesar.designpattern.zen.chp24;

public class Client24_19 {
    public static void main(String[] args) {
        // 定义出发起人
        Originator3 originator3 = new Originator3();
        // 定义出备忘录管理员
        Caretaker3 caretaker = new Caretaker3();
        // 初始化
        originator3.setState1("中国");
        originator3.setState2("强盛");
        originator3.setState3("繁荣");
        System.out.println("-----初始化状态-----\n" + originator3);

        // 创建一个备忘录
        caretaker.setMemento(originator3.createMemento());
        // 修改状态值
        originator3.setState1("软件");
        originator3.setState2("架构");
        originator3.setState3("优秀");
        System.out.println("-----修改后的状态-----\n" + originator3);

        // 恢复一个备忘录
        originator3.restoreMemento(caretaker.getMemento());
        System.out.println("-----恢复后的状态-----\n" + originator3);
    }
}
