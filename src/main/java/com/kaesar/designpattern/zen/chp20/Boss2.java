package com.kaesar.designpattern.zen.chp20;

import java.util.ArrayList;

public class Boss2 {
    public static void main(String[] args) {
        // 定义一个List，存放所有的项目对象
        IProject2 project = new Project2();
        // 增加星球大战项目
        project.add("星球大战项目", 10, 100000);
        // 增加扭转时空项目
        project.add("扭转时空项目", 100, 1000000);
        // 增加超人改造项目
        project.add("超人改造项目", 10000, 1000000000);
        // 这边100个项目
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }
        // 遍历一下ArrayList，把所有的数据都取出
        IProject2Iterator project2Iterator = project.iterator();
        while (project2Iterator.hasNext()) {
            IProject2 p = (IProject2) project2Iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
