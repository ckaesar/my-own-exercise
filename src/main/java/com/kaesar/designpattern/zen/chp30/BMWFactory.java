package com.kaesar.designpattern.zen.chp30;

/**
 * 宝马车工厂
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:29 上午
 */
public class BMWFactory implements CarFactory {
    // 生产SUV
    @Override
    public ICar createSuv() {
        return new BMWSuv();
    }

    // 生产商务车
    @Override
    public ICar createVan() {
        return new BWMVan();
    }
}
