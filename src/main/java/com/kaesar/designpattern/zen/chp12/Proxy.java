package com.kaesar.designpattern.zen.chp12;

public class Proxy implements Subject {
    // 要道理实现哪个类
    private Subject subject = null;

    // 默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }

    // 通过构造函数传递代理者
    public Proxy(Object... objects) {

    }

    // 实现接口中定义的犯法
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    // 预处理
    private void before() {

    }

    // 善后处理
    private void after() {

    }
}
