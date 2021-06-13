package com.kaesar.designpattern.zen.chp38;

import java.util.ArrayList;

/**
 * 用户操作
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:23 下午
 */
public class UserProvider2 implements IUserProvider2 {
    // 用户列表
    private ArrayList<User> userList;

    // 传递用户列表
    public UserProvider2(ArrayList<User> userList) {
        this.userList = userList;
    }

    // 根据指定的规格书查找用户
    @Override
    public ArrayList<User> findUser(IUserSpecification userSpecification) {
        ArrayList<User> result = new ArrayList<>();
        for (User user : userList) {
            if (userSpecification.isSatifiedBy(user)) {
                result.add(user);
            }
        }
        return result;
    }
}
