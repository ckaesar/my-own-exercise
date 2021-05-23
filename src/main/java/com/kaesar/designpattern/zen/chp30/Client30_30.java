package com.kaesar.designpattern.zen.chp30;

/**
 * @Author: chengk
 * @Date: 2021/5/23 11:58 上午
 */
public class Client30_30 {
    public static void main(String[] args) {
        // 定义出导演类
        Director2 director2 = new Director2();
        // 给我一辆奔驰车SUV
        System.out.println("===制造一辆奔驰SUV===");
        ICar benzSuv = director2.createBenzSuv();
        System.out.println(benzSuv);
        // 给我一辆宝马商务车
        System.out.println("===制造一辆宝马商务车===");
        ICar bmwVan = director2.createBMWVan();
        System.out.println(bmwVan);
        // 给我一辆混合车型
        System.out.println("===制造一辆混合车型===");
        ICar complexCar = director2.createComplexCar();
        System.out.println(complexCar);
    }
}
