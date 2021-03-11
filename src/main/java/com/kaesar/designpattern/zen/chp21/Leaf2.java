package com.kaesar.designpattern.zen.chp21;

public class Leaf2 implements ILeaf2 {
    // 叶子节点的名字
    private String name = "";

    // 叶子节点的职位
    private String position = "";

    // 叶子节点的薪水
    private int salary = 0;

    // 通过构造函数传递叶子节点的信息
    public Leaf2(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 叶子节点的信息
    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
