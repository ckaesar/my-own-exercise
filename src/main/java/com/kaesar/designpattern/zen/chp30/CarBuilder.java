package com.kaesar.designpattern.zen.chp30;

/**
 * 抽象建造者
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:40 上午
 */
public abstract class CarBuilder {
    // 待建造的汽车
    private ICar car;

    // 设计蓝图
    private Blueprint bp;

    public Car buildCar() {
        // 按照顺序生产一辆车
        return new Car(buildWheel(), buildWheel());
    }

    // 接受一份设计蓝图
    public void receiveBluePrint(Blueprint _bp) {
        this.bp = _bp;
    }

    // 查看蓝图，只有真正的建造者才可以看到蓝图
    protected Blueprint getBluePrint() {
        return bp;
    }

    // 建造车轮
    protected abstract String buildWheel();

    // 建造引擎
    protected abstract String buidEngine();
}
