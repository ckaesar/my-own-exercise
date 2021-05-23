package com.kaesar.designpattern.zen.chp30;

/**
 * 抽象工厂
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:28 上午
 */
public interface CarFactory {
    // 生产SUV
    public ICar createSuv();

    // 生产商务车
    public ICar createVan();
}
