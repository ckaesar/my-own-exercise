package com.kaesar.designpattern.zen.chp30;

/**
 * @Author: chengk
 * @Date: 2021/5/21 12:09 上午
 */
public class Client30_11 {
    public static void main(String[] args) {
        // 建造一个成年超人
        BuilderSuperMan adultSuperMan = Director.getAdultSuperMan();
        // 展示一下超人的信息
        System.out.println(adultSuperMan.getSpecialTalent());
    }
}
