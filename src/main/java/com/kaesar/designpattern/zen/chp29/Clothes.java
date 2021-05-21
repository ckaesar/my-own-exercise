package com.kaesar.designpattern.zen.chp29;

/**
 * 服装
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:27 下午
 */
public class Clothes extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产出的衣服是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }
}
