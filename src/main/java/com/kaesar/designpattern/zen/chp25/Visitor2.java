package com.kaesar.designpattern.zen.chp25;

public class Visitor2 implements IVisitor2 {
    @Override
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}
