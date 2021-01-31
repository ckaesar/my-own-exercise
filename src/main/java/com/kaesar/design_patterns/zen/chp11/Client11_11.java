package com.kaesar.design_patterns.zen.chp11;

public class Client11_11 {
    public static void main(String[] args) {
        Director director = new Director();
        // 1万辆A类型的奔驰车
        for (int i = 0; i < 100; i++) {
            director.getABenzModel().run();
        }
        // 100万辆B类型的奔驰车
        for (int i = 0; i < 1000; i++) {
            director.getBBenzModel().run();
        }
        // 1000万辆的C类型的宝马车
        for (int i = 0; i < 10000; i++) {
            director.getCBMWModel().run();
        }
    }
}
