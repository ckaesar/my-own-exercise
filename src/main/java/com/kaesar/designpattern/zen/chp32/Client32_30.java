package com.kaesar.designpattern.zen.chp32;

/**
 * @Author: chengk
 * @Date: 2021/5/29 11:19 上午
 */
public class Client32_30 {
    public static void main(String[] args) {
        // 定义一个人的初始状态
        Human human = new Human();

        human.setState(new ChildState());
        System.out.println("=====儿童的主要工作=====");
        human.work();
        System.out.println("\n=====成年人的主要工作=====");
        human.work();
        System.out.println("\n=====老年人的主要工作=====");
        human.work();
    }
}
