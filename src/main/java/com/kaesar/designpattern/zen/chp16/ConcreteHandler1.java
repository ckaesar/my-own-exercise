package com.kaesar.designpattern.zen.chp16;

public class ConcreteHandler1 extends AbstractHandler {
    // 设置自己的处理级别
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    // 定义自己的处理逻辑
    @Override
    protected Response echo(Request request) {
        return null;
    }
}
