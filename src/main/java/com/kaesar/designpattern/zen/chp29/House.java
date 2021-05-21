package com.kaesar.designpattern.zen.chp29;

/**
 * 房子
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:16 下午
 */
public class House extends Product {
    // 豆腐渣就豆腐渣呗，好歹也是房子
    @Override
    public void beProducted() {
        System.out.println("生产出来的房子是这样的...");
    }

    // 虽然是豆腐渣，也是能够销售出去的
    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
