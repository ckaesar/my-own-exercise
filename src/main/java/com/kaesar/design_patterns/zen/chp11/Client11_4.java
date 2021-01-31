package com.kaesar.design_patterns.zen.chp11;

import java.util.ArrayList;

public class Client11_4 {
    public static void main(String[] args) {
        /**
         * 客户告诉XX公司，我要这样一个模型，然后XX公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        BenzModel benz = new BenzModel();
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        benz.setSequence(sequence);
        benz.run();

    }
}
