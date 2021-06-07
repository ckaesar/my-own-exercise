package com.kaesar.designpattern.zen.chp33;

/**
 * 吹大话
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:42 上午
 */
public class HotAir extends Decorator {
    public HotAir(IStar2 star) {
        super(star);
    }

    @Override
    public void act() {
        System.out.println("演前：夸夸其谈，没有自己不能演的角色");
        super.act();
    }
}
