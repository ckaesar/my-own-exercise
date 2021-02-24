package com.kaesar.design_patterns.zen.chp15;

/**
 * 具体的Command类
 */
public class ConcreteCommand1 extends AbstractCommand {
    //对哪个Receiver类进行命令处理
    private Receiver receiver;

    public ConcreteCommand1(Receiver _receiver) {
        this.receiver = _receiver;
    }

    // 必须实现的一个命令
    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}
