package com.kaesar.design_patterns.zen.chp15;

/**
 * 通用模式的场景类
 */
public class Client15_18 {
    public static void main(String[] args) {
        // 首先声明调用者Invoker
        InvokerClass invoker = new InvokerClass();
        // 定义接收者
        Receiver receiver = new ConcreteReceiver1();
        // 定义一个发送给接受者的命令
        AbstractCommand command = new ConcreteCommand1(receiver);
        // 把命令交给调用者去执行
        invoker.setCommand(command);
        // 执行命令
        invoker.action();
    }
}
