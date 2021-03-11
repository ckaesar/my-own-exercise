package com.kaesar.designpattern.zen.chp21;

import java.util.ArrayList;

public class Client21_7 {
    public static void main(String[] args) {
        // 首先要产生一个根节点
        IRoot ceo = new Root("王麻子", "总经理", 100000);
        // 产生三个部门经历，也就是树枝节点
        IBranch developDep = new Branch("刘瘸子", "研发部经理", 10000);
        IBranch salesDep = new Branch("马拐子", "销售部经理", 20000);
        IBranch financeDep = new Branch("赵驼子", "财务部经理", 30000);
        // 再把三个小组长产生出来
        IBranch firstDevGroup = new Branch("杨斜子", "开发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴锤子", "开发二组组长", 5000);
        // 剩下的就是小兵了
        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 3000);
        ILeaf c = new Leaf("c", "开发人员", 4000);
        ILeaf d = new Leaf("d", "开发人员", 5000);
        ILeaf e = new Leaf("e", "开发人员", 6000);
        ILeaf f = new Leaf("f", "开发人员", 7000);
        ILeaf g = new Leaf("g", "销售人员", 4000);
        ILeaf h = new Leaf("h", "销售人员", 5000);
        ILeaf i = new Leaf("i", "销售人员", 6000);
        ILeaf j = new Leaf("j", "财务人员", 7000);
        ILeaf k = new Leaf("k", "CEO秘书", 8000);
        ILeaf zhengLiu = new Leaf("郑六子", "研发部副总", 20000);
        // 组装
        // 总经理下有三个部门经理
        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);
        // 总经理下还有一个秘书
        ceo.add(k);
        // 定义研发部的结构
        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        // 研发部经历下还有一个副总
        developDep.add(zhengLiu);
        // 两个开发小组
        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);
        // 销售部门的人员情况
        salesDep.add(h);
        salesDep.add(i);
        // 财务部门
        financeDep.add(j);
        // 打印写完的树状结构
        System.out.println(ceo.getInfo());
        // 打印出整个树形
        getAllSubordinateInfo(ceo.getSubordinateInfo());
    }

    // 遍历所有的树枝节点，打印出信息
    private static void getAllSubordinateInfo(ArrayList subordinateInfo) {
        int length = subordinateInfo.size();
        // 定义一个ArrayList长度，不要在for循环中每次计算
        for (int i = 0; i < length; i++) {
            Object s = subordinateInfo.get(i);
            if (s instanceof Leaf) {
                // 叶子节点
                ILeaf employee = (ILeaf) s;
                System.out.println(employee.getInfo());
            } else {
                // 树枝节点
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
