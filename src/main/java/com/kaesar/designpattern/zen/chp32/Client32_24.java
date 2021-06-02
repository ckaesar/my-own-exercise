package com.kaesar.designpattern.zen.chp32;

/**
 * @Author: chengk
 * @Date: 2021/5/29 11:08 上午
 */
public class Client32_24 {
    public static void main(String[] args) {
        // 定义一个环境角色
        StrategyContext context = new StrategyContext();
        System.out.println("=====儿童的主要工作=====");
        context.setWork(new ChildWork());
        context.work();

        System.out.println("=====成年人的主要工作=====");
        context.setWork(new AdultWork());
        context.work();

        System.out.println("=====老年人的主要工作=====");
        context.setWork(new OldWork());
        context.work();
    }
}
