package com.kaesar.design_patterns.zen.chp14;

public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    // 构造函数
    public AbstractMediator() {
//        this.purchase = new Purchase(this);
    }
}
