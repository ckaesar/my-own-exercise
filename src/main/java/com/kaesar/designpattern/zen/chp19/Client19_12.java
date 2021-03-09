package com.kaesar.designpattern.zen.chp19;

public class Client19_12 {
    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        // 现在新增了适配去角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
