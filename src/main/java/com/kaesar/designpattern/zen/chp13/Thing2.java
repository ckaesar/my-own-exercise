package com.kaesar.designpattern.zen.chp13;

import java.util.ArrayList;

public class Thing2 implements Cloneable {
    // 定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();

    public Thing2 clone() {
        Thing2 thing = null;
        try {
            thing = (Thing2) super.clone();
            // 深拷贝与浅拷贝的区别 可以把这一行注释掉看看结果
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
