package com.kaesar.designpattern.zen.chp31;

/**
 * 抽象装饰类
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:15 下午
 */
public class Decorator implements Swan {
    private Swan swan;

    // 修饰的是谁
    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void desApperance() {
        swan.desApperance();
    }
}
