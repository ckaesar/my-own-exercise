package com.kaesar.designpattern.zen.chp30;

/**
 * 宝马SUV
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:20 上午
 */
public class BMWSuv extends AbsBMW {
    private final static String X_SEARIES = "X系列车型SUV";

    @Override
    public String getModel() {
        return X_SEARIES;
    }
}
