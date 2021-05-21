package com.kaesar.designpattern.zen.chp29;

/**
 * iPod产品
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:17 下午
 */
public class IPod extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
