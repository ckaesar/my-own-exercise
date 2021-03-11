package com.kaesar.designpattern.zen.chp21;

import java.util.ArrayList;

public class Branch implements IBranch {
    // 存储子节点的信息
    private ArrayList suboardinateList = new ArrayList();

    // 树枝节点的名称
    private String name = "";

    // 树枝节点的职位
    private String position = "";

    // 树枝节点的薪水
    private int salary = 0;

    // 通过构造函数传递树枝节点的参数
    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 获得自己树枝节点的信息
    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

    // 增加一个子树枝节点
    @Override
    public void add(IBranch branch) {
        this.suboardinateList.add(branch);
    }

    // 增加一个叶子节点
    @Override
    public void add(ILeaf leaf) {
        this.suboardinateList.add(leaf);
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.suboardinateList;
    }
}
