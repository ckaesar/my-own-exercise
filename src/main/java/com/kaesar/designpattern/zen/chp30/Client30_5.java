package com.kaesar.designpattern.zen.chp30;

/**
 * @Author: chengk
 * @Date: 2021/5/20 11:53 下午
 */
public class Client30_5 {
    public static void main(String[] args) {
        // 生产一个成年超人
        ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
        // 展示一下超人的技能
        adultSuperMan.specialTalent();
    }
}
