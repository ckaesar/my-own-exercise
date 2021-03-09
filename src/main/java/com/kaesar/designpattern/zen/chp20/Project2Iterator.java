package com.kaesar.designpattern.zen.chp20;

import java.util.ArrayList;

public class Project2Iterator implements IProject2Iterator {
    // 所有的项目都放在Arraylist中
    private ArrayList<IProject2> projectList = new ArrayList<>();
    private int currentItem = 0;

    // 构造函数传入projectList
    public Project2Iterator(ArrayList<IProject2> projectList) {
        this.projectList = projectList;
    }


    @Override
    public boolean hasNext() {
        // 定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        return this.projectList.get(this.currentItem++);
    }
}
