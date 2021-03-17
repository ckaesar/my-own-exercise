package com.kaesar.designpattern.zen.chp25;

public interface IVisitor2 {
    // 可以访问哪些对象
    public void visit(ConcreteElement1 el1);

    public void visit(ConcreteElement2 el2);
}
