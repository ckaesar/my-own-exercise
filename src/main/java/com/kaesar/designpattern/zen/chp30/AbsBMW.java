package com.kaesar.designpattern.zen.chp30;

/**
 * 抽象宝马车
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:16 上午
 */
public abstract class AbsBMW implements ICar {
    private final static String BMW_BAND = "宝马汽车";

    // 宝马车
    public String getBand() {
        return BMW_BAND;
    }

    // 型号由具体的实现类实现
    public abstract String getModel();
}
