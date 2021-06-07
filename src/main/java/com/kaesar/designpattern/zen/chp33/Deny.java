package com.kaesar.designpattern.zen.chp33;

/**
 * 抵赖
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:42 上午
 */
public class Deny extends Decorator {

    public Deny(IStar2 star) {
        super(star);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("演后：百般抵赖，死不承认");
    }
}
