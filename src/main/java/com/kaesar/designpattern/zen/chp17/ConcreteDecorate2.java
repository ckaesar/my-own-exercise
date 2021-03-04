package com.kaesar.designpattern.zen.chp17;

public class ConcreteDecorate2 extends AbstractDecorator {
    public ConcreteDecorate2(Component _component) {
        super(_component);
    }

    // 定义自己的修饰方法
    private void method2() {
        System.out.println("method2 修饰");
    }

    // 重写父类的Operation方法
    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
