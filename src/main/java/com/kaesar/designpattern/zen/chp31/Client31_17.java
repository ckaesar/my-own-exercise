package com.kaesar.designpattern.zen.chp31;

/**
 * @Author: chengk
 * @Date: 2021/5/23 2:30 下午
 */
public class Client31_17 {
    public static void main(String[] args) {
        // 鸭妈妈有五个孩子，其中四个都是一个模样
        System.out.println("===妈妈有五个孩子，其中四个模样是这样的：===");
        Duck duck = new Duckling();
        duck.cry(); // 小鸭子的叫声
        duck.desAppearance(); // 小鸭子的外形
        duck.desBehavior(); // 小鸭子的其他行为
        System.out.println("\n一只独特的小鸭子，模样是这样的：===");
        Duck uglyDucking = new UglyDucking();
        uglyDucking.cry(); // 丑小鸭的叫声
        uglyDucking.desAppearance(); // 丑小鸭的外形
        uglyDucking.desBehavior(); // 丑小鸭的其他行为
    }
}
