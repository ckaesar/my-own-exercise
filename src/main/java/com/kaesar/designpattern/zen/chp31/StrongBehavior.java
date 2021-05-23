package com.kaesar.designpattern.zen.chp31;

/**
 * 强化行为
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:18 下午
 */
public class StrongBehavior extends Decorator {
    // 强化谁
    public StrongBehavior(Swan swan) {
        super(swan);
    }

    // 会飞行了
    public void fly() {
        System.out.println("会飞行了！");
    }
}
