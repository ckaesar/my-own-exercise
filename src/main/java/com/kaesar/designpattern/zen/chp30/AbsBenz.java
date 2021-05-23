package com.kaesar.designpattern.zen.chp30;

/**
 * 抽象奔驰车
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:22 上午
 */
public abstract class AbsBenz implements ICar {
    private final static String BENZ_BAND = "奔驰汽车";

    @Override
    public String getBand() {
        return BENZ_BAND;
    }

    // 具体型号由实现类完成
    public abstract String getModel();
}
