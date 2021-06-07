package com.kaesar.designpattern.zen.chp33;

/**
 * 抽象装饰类
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:40 上午
 */
public abstract class Decorator implements IStar2 {
    // 粉饰的是谁
    private IStar2 star;

    public Decorator(IStar2 star) {
        this.star = star;
    }

    @Override
    public void act() {
        this.star
                .act();
    }
}
