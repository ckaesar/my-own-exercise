package com.kaesar.designpattern.zen.chp30;

/**
 * 具体车辆
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:37 上午
 */
public class Car implements ICar {
    // 汽车引擎
    private String engine;

    // 汽车车轮
    private String wheel;

    public Car(String _engine, String _wheel) {
        this.engine = _engine;
        this.wheel = _wheel;
    }

    public String getEngine() {
        return engine;
    }

    public String getWheel() {
        return wheel;
    }

    public String toString() {
        return "车的轮子是：" + wheel + "\n车的引擎是：" + engine;
    }

    @Override
    public String getBand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }
}
