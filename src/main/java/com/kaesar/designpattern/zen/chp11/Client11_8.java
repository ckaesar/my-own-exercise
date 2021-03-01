package com.kaesar.designpattern.zen.chp11;

import java.util.ArrayList;

public class Client11_8 {
    public static void main(String[] args) {
        /**
         * 客户告诉XX公司，我要这样一个模型，然后XX公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        // 要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        // 制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        // 奔驰车跑一下
        benz.run();

        System.out.println();

        // 要一个宝马车
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        // 制造出一个宝马车
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        // 宝马车跑一下
        bmw.run();
    }
}
