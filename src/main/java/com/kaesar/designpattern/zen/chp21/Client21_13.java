package com.kaesar.designpattern.zen.chp21;

import java.util.ArrayList;

public class Client21_13 {
    public static void main(String[] args) {
        // 首先要产生一个根节点
        Branch2 ceo = new Branch2("王麻子", "总经理", 100000);
        // 产生三个部门经历，也就是树枝节点
        Branch2 developDep = new Branch2("刘瘸子", "研发部经理", 10000);
        Branch2 salesDep = new Branch2("马拐子", "销售部经理", 20000);
        Branch2 financeDep = new Branch2("赵驼子", "财务部经理", 30000);
        // 再把三个小组长产生出来
        Branch2 firstDevGroup = new Branch2("杨斜子", "开发一组组长", 5000);
        Branch2 secondDevGroup = new Branch2("吴锤子", "开发二组组长", 5000);
        // 剩下的就是小兵了
        Leaf2 a = new Leaf2("a", "开发人员", 2000);
        Leaf2 b = new Leaf2("b", "开发人员", 3000);
        Leaf2 c = new Leaf2("c", "开发人员", 4000);
        Leaf2 d = new Leaf2("d", "开发人员", 5000);
        Leaf2 e = new Leaf2("e", "开发人员", 6000);
        Leaf2 f = new Leaf2("f", "开发人员", 7000);
        Leaf2 g = new Leaf2("g", "销售人员", 4000);
        Leaf2 h = new Leaf2("h", "销售人员", 5000);
        Leaf2 i = new Leaf2("i", "销售人员", 6000);
        Leaf2 j = new Leaf2("j", "财务人员", 7000);
        Leaf2 k = new Leaf2("k", "CEO秘书", 8000);
        Leaf2 zhengLiu = new Leaf2("郑六子", "研发部副总", 20000);
        // 组装
        // 总经理下有三个部门经理
        ceo.addSuboardinate(developDep);
        ceo.addSuboardinate(salesDep);
        ceo.addSuboardinate(financeDep);
        // 总经理下还有一个秘书
        ceo.addSuboardinate(k);
        // 定义研发部的结构
        developDep.addSuboardinate(firstDevGroup);
        developDep.addSuboardinate(secondDevGroup);
        // 研发部经历下还有一个副总
        developDep.addSuboardinate(zhengLiu);
        // 两个开发小组
        firstDevGroup.addSuboardinate(a);
        firstDevGroup.addSuboardinate(b);
        firstDevGroup.addSuboardinate(c);
        secondDevGroup.addSuboardinate(d);
        secondDevGroup.addSuboardinate(e);
        secondDevGroup.addSuboardinate(f);
        // 销售部门的人员情况
        salesDep.addSuboardinate(h);
        salesDep.addSuboardinate(i);
        // 财务部门
        financeDep.addSuboardinate(j);
        // 打印写完的树状结构
        System.out.println(ceo.getInfo());
        // 打印出整个树形
        getAllSubordinateInfo(ceo.getSuboardinate());
    }

    // 遍历所有的树枝节点，打印出信息
    private static void getAllSubordinateInfo(ArrayList subordinateInfo) {
        int length = subordinateInfo.size();
        // 定义一个ArrayList长度，不要在for循环中每次计算
        for (int i = 0; i < length; i++) {
            Object s = subordinateInfo.get(i);
            if (s instanceof Leaf2) {
                // 叶子节点
                Leaf2 employee = (Leaf2) s;
                System.out.println(employee.getInfo());
            } else {
                // 树枝节点
                Branch2 branch = (Branch2) s;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSuboardinate());
            }
        }
    }
}
