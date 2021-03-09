package com.kaesar.designpattern.zen.chp20;

public interface IProject2 {
    // 增加项目
    public void add(String name, int num, int cost);

    // 从老板这里看到的就是项目信息
    public String getProjectInfo();

    // 获得一个可以被遍历的对象
    public IProject2Iterator iterator();
}
