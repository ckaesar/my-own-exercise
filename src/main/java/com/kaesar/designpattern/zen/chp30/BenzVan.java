package com.kaesar.designpattern.zen.chp30;

/**
 * 奔驰商务车
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:24 上午
 */
public class BenzVan extends AbsBenz {
    private final static String R_SERIES = "R系列商务车";

    @Override
    public String getModel() {
        return R_SERIES;
    }
}
