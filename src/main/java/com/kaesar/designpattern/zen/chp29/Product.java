package com.kaesar.designpattern.zen.chp29;

/**
 * 抽象产品类
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:14 下午
 */
public abstract class Product {

    // 甭管是什么产品它总是要被生产出来
    public abstract void beProducted();

    // 生产出来的东西，一定要销售出去，否则亏本
    public abstract void beSelled();
}
