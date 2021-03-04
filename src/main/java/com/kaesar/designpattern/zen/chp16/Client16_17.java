package com.kaesar.designpattern.zen.chp16;

public class Client16_17 {
    public static void main(String[] args) {
        // 声明所有的处理节点
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler1();
        AbstractHandler handler3 = new ConcreteHandler1();
        // 设置链中的阶段顺序 1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        // 提交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}
