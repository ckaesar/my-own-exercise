package com.kaesar.designpattern.zen.chp13;

/**
 * Object类的clone方法的原理是从内存中（具体地说就是堆内存）以二进制流的方式进行拷贝，重新分配一个内存块，执行clone方法时构造函数不会被执行
 */
public class Client13_9 {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
