package com.kaesar.designpattern.zen;

public class Client8_12 {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /**
         * 继续业务处理
         */
    }
}
