package com.kaesar.designpattern.zen.chp15;

/**
 * 调用者InvokerClass类
 */
public class InvokerClass {
    private AbstractCommand command;

    // 受气包，接受命令
    public void setCommand(AbstractCommand _command) {
        this.command = _command;
    }

    // 执行命令
    public void action() {
        this.command.execute();
    }
}
