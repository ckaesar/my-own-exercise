package com.kaesar.designpattern.zen.chp38;

import java.util.ArrayList;

/**
 * 用户操作类
 *
 * @Author: chengk
 * @Date: 2021/6/13 12:57 下午
 */
public class UserProvider implements IUserProvider {
    // 用户列表
    private ArrayList<User> userList;

    // 构造函数传递用户列表
    public UserProvider(ArrayList<User> userList) {
        this.userList = userList;
    }

    // 姓名等于指定姓名的用户
    @Override
    public ArrayList<User> findUserByNameEqual(String name) {
        ArrayList<User> result = new ArrayList<>();
        for (User user : userList) {
            if (user.getName().equals(name)) {
                result.add(user);
            }
        }
        return result;
    }

    // 年龄大于指定年龄的用户
    @Override
    public ArrayList<User> findUserByAgeThan(int age) {
        ArrayList<User> result = new ArrayList<>();
        for (User user : userList) {
            if (user.getAge() > age) {
                result.add(user);
            }
        }
        return result;
    }
}
