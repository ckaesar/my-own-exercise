package com.kaesar.designpattern.zen.chp15;

public class Client15_6 {
    public static void main(String[] args) {
        // 首先要找到美工组说，过来谈页面，并修改
        System.out.println("-----客户要求删除一个页面-----");
        Group group = new PageGroup();
        // 找到需求
        group.find();
        // 增加一个需求
        group.delete();
        // 要求变更计划
        group.plan();
    }
}
