package com.kaesar.designpattern.zen.chp13;

public class Client13_11 {
    public static void main(String[] args) {
        // 产生一个对象
        Thing2 thing2 = new Thing2();
        // 设置一个值
        thing2.setValue("张三");
        // 拷贝一个对象
        Thing2 cloneThing = thing2.clone();
        cloneThing.setValue("李四");
        System.out.println(thing2.getValue());
    }
}
