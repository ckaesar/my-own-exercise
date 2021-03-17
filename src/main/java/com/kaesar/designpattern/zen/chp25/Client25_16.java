package com.kaesar.designpattern.zen.chp25;

public class Client25_16 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 获得元素对象
            Element el = ObjectStructure.createElement();
            // 接受访问者访问
            el.accept(new Visitor2());
        }
    }
}
