package com.kaesar.design_patterns.zen.chp14;

/**
 * 抽象中介者
 */
public abstract class AbstractMediator {
    protected Purchase1 purchase;
    protected Sale1 sale;
    protected Stock1 stock;

    // 构造函数
    public AbstractMediator() {
        this.purchase = new Purchase1(this);
        this.sale = new Sale1(this);
        this.stock = new Stock1(this);
    }

    // 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object... objects);
}
