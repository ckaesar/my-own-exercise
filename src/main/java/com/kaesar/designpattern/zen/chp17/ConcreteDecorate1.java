package com.kaesar.designpattern.zen.chp17;

public class ConcreteDecorate1 extends AbstractDecorator {
    public ConcreteDecorate1(Component _component) {
        super(_component);
    }

    // 定义自己的修饰方法
    private void method1() {
        System.out.println("method1 修饰");
    }

    // 重写父类的Operation方法
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
