package com.kaesar.designpattern.zen.chp30;

/**
 * 汽车接口
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:15 上午
 */
public interface ICar {
    // 汽车的生产商，也就是牌子
    public String getBand();

    // 汽车的型号
    public String getModel();
}
