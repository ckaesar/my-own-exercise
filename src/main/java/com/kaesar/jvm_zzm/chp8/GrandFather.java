package com.kaesar.jvm_zzm.chp8;

/**
 * 方法调用问题
 */
public class GrandFather {
    void thinking() {
        System.out.println("i am grandfather");
    }
}
class Father extends GrandFather {

    @Override
    void thinking() {
        System.out.println("i am father");
    }
}

class Son extends Father {
    @Override
    void thinking() {
        System.out.println("i am son");
        // 怎么实现调用祖父类的thinking()方法，打印"i am grandfather" ???
    }
}