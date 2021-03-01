package com.kaesar.designpattern.zen.chp16;

import java.util.ArrayList;
import java.util.Random;

/**
 * 场景类
 */
public class Client16_13 {
    public static void main(String[] args) {
        // 随机挑选几名女性
        Random rand = new Random();
        ArrayList<IWomen> womens = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            womens.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        // 定义三个请示对象
        Handler father = new Father2();
        Handler husband = new Husband2();
        Handler son = new Son2();
        // 设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : womens) {
            father.HandlerMessage(women);
        }
    }
}
