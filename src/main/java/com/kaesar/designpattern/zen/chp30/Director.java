package com.kaesar.designpattern.zen.chp30;

/**
 * 导演雷
 *
 * @Author: chengk
 * @Date: 2021/5/21 12:06 上午
 */
public class Director {
    // 两个建造者的引用
    private static Builder adultBuilder = new AdultSuperManBuilder();

    // 未成年超人的建造者
    private static Builder childBuilder = new ChildSuperManBuilder();

    // 建造一个成年、会飞行的超人
    public static BuilderSuperMan getAdultSuperMan() {
        return adultBuilder.getSuperMan();
    }

    // 建造一个未成年、刀枪不入的超人
    public static BuilderSuperMan getChildSuperMan() {
        return childBuilder.getSuperMan();
    }
}
