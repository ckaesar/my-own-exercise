package com.kaesar.design_patterns.zen.chp15;

public class Client15_5 {
    public static void main(String[] args) {
        // 首先要找到需求组说，过来谈需求，并修改
        System.out.println("-----客户要求增加一项需求-----");
        Group group = new RequirementGroup();
        // 找到需求
        group.find();
        // 增加一个需求
        group.add();
        // 要求变更计划
        group.plan();
    }
}
