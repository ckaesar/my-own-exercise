package com.kaesar.designpattern.zen.chp38;

import java.util.ArrayList;

/**
 * 用户操作对象接口
 *
 * @Author: chengk
 * @Date: 2021/6/13 12:56 下午
 */
public interface IUserProvider {
    // 根据用户名查找用户
    public ArrayList<User> findUserByNameEqual(String name);

    // 年龄大于指定年龄的用户
    public ArrayList<User> findUserByAgeThan(int age);
}
