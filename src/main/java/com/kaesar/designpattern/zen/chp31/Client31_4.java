package com.kaesar.designpattern.zen.chp31;

/**
 * @Author: chengk
 * @Date: 2021/5/23 12:33 下午
 */
public class Client31_4 {
    public static void main(String[] args) {
        // 定义一个短跑运动员
        IRunner liu = new Runner();
        // 定义liu的代理人
        IRunner agent = new RunnerAgent(liu);
        // 要求运动员跑步
        System.out.println("===客人找到运动员的代理要求其去跑步===");
        agent.run();
    }
}
