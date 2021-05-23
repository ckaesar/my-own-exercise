package com.kaesar.designpattern.zen.chp30;

/**
 * 奔驰车工厂
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:31 上午
 */
public class BenzFactory implements CarFactory {
    // 生产SUV
    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

    // 生产商务车
    @Override
    public ICar createVan() {
        return new BenzVan();
    }
}
