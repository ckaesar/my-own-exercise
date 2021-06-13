package com.kaesar.designpattern.zen.chp38;

/**
 * 大于基准年龄的规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:21 下午
 */
public class UserByAgeThan implements IUserSpecification {
    // 基准年龄
    private int age;

    // 构造函数攒底基准年龄
    public UserByAgeThan(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatifiedBy(User user) {
        return user.getAge() > age;
    }
}
