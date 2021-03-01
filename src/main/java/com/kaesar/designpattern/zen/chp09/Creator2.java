package com.kaesar.designpattern.zen.chp09;

public class Creator2 extends AbstractCreator {
    // 只生产产品等级为2的A2产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    // 只生产产品等级为2的B2产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
