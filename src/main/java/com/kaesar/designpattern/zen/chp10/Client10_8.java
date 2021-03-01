package com.kaesar.designpattern.zen.chp10;

public class Client10_8 {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        // 调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
