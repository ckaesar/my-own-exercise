package com.kaesar.designpattern.zen.chp31;

/**
 * 丑小鸭
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:12 下午
 */
public class UglyDuckling implements Swan {
    // 丑小鸭的叫声
    @Override
    public void cry() {
        System.out.println("叫声是克鲁--克鲁--克鲁");
    }

    // 丑小鸭还比较小，不能飞
    @Override
    public void fly() {
        System.out.println("不能飞行");
    }

    // 丑小鸭的外形
    @Override
    public void desApperance() {
        System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
    }
}
