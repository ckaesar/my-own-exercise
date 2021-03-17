package com.kaesar.designpattern.zen.chp25;

public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {
        // 业务处理
    }

    @Override
    public void accept(IVisitor2 visitor) {
        visitor.visit(this);
    }
}
