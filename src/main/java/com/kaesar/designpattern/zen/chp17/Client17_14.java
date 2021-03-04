package com.kaesar.designpattern.zen.chp17;

public class Client17_14 {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteDecorate1(component);
        // 第二次修饰
        component = new ConcreteDecorate2(component);
        // 修饰后运行
        component.operate();
    }
}
