package com.kaesar.designpattern.zen.chp09;

public class Creator1 extends AbstractCreator {
    // 只生产产品等级为1的A1产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    // 只生产产品等级为1的B1产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
