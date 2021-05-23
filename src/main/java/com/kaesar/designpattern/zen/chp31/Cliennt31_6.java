package com.kaesar.designpattern.zen.chp31;

/**
 * @Author: chengk
 * @Date: 2021/5/23 12:38 下午
 */
public class Cliennt31_6 {
    public static void main(String[] args) {
        // 定义运动员
        IRunner liu = new Runner();
        // 对其功能加强
        liu = new RunnerWithJet(liu);
        // 看看它的跑步情况如何
        System.out.println("===增强后的运动员的功能===");
        liu.run();
    }
}
