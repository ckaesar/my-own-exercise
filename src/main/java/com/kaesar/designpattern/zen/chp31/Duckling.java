package com.kaesar.designpattern.zen.chp31;

/**
 * 小鸭子
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:26 下午
 */
public class Duckling implements Duck {
    @Override
    public void cry() {
        System.out.println("叫声是嘎-嘎-嘎");
    }

    @Override
    public void desAppearance() {
        System.out.println("外形是黄白相间，嘴长");
    }

    @Override
    public void desBehavior() {
        System.out.println("会游泳");
    }
}
