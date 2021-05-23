package com.kaesar.designpattern.zen.chp30;

/**
 * 奔驰SUV
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:25 上午
 */
public class BenzSuv extends AbsBenz {
    private final static String G_SERIES = "G系列SUV";

    @Override
    public String getModel() {
        return G_SERIES;
    }
}
