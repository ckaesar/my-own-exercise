package com.kaesar.designpattern.zen.chp38;

import lombok.Data;

/**
 * 用户类
 *
 * @Author: chengk
 * @Date: 2021/6/13 12:39 下午
 */
@Data
public class User {
    // 姓名
    private String name;
    // 年龄
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "用户名：" + this.name + "\t年龄：" + this.age;
    }
}
