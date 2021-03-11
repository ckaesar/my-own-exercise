package com.kaesar.designpattern.zen.chp21;

public class Client21_21 {
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        // 创建一个树枝节点
        Composite branch = new Composite();
        // 创建一个叶子节点
        Leaf3 leaf = new Leaf3();
        // 建立整体
        root.add(branch);
        branch.add(leaf);
    }
}
