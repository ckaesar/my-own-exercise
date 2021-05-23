package com.kaesar.designpattern.zen.chp30;

/**
 * 宝马商务车
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:18 上午
 */
public class BWMVan extends AbsBMW {
    private final static String SEVENT_SEARIES = "7系列车型商务车";

    @Override
    public String getModel() {
        return SEVENT_SEARIES;
    }
}
