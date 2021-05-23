package com.kaesar.designpattern.zen.chp30;

/**
 * 导演类
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:51 上午
 */
public class Director2 {
    // 声明对建造者的引用
    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bmwBuilder = new BMWBuilder();

    // 生产奔驰SUV
    public ICar createBenzSuv() {
        // 制造出汽车
        return createCar(benzBuilder, "benz的引擎", "benz的轮胎");
    }

    // 生产出一辆宝马商务车
    public ICar createBMWVan() {
        return createCar(bmwBuilder, "BMW的引擎", "BMW的轮胎");
    }

    // 生产出一个混合车型
    public ICar createComplexCar() {
        return createCar(bmwBuilder, "BMW的引擎", "benz的轮胎");
    }

    // 生产车辆
    private ICar createCar(CarBuilder _carBuilder, String engine, String wheel) {
        // 导演怀揣蓝图
        Blueprint bp = new Blueprint();
        bp.setEngine(engine);
        bp.setWheel(wheel);
        System.out.println("获得生产蓝图");
        _carBuilder.receiveBluePrint(bp);
        return _carBuilder.buildCar();
    }
}
