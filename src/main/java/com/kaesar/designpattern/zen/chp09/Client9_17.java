package com.kaesar.designpattern.zen.chp09;

public class Client9_17 {
    public static void main(String[] args) {
        // 定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        // 产生A1对象
        AbstractProductA a1 = creator1.createProductA();
        // 产生A2对象
        AbstractProductA a2 = creator2.createProductA();
        // 产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        // 产生B2对象
        AbstractProductB b2 = creator2.createProductB();
    }
}
