package com.kaesar.designpattern.zen.chp31;

/**
 * 丑小鸭
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:28 下午
 */
public class UglyDucking extends WhiteSwan implements Duck {
    // 丑小鸭的叫声
    public void cry() {
        super.cry();
    }

    // 丑小鸭的外形
    @Override
    public void desAppearance() {
        super.desApperance();
    }

    // 丑小鸭的其他行为
    @Override
    public void desBehavior() {
        // 丑小鸭不仅会有用
        System.out.println("会游泳");
        // 还会飞行
        super.fly();
    }
}
