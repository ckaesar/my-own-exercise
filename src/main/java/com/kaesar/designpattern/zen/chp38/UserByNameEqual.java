package com.kaesar.designpattern.zen.chp38;

/**
 * 姓名相同的规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:20 下午
 */
public class UserByNameEqual implements IUserSpecification {
    // 基准姓名
    private String name;

    // 构造函数传递基准姓名
    public UserByNameEqual(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatifiedBy(User user) {
        return user.getName().equals(name);
    }
}
