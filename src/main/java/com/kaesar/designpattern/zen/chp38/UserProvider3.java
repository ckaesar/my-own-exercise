package com.kaesar.designpattern.zen.chp38;

import java.util.ArrayList;

/**
 * 用户操作
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:23 下午
 */
public class UserProvider3 implements IUserProvider3 {
    // 用户列表
    private ArrayList<User> userList;

    // 传递用户列表
    public UserProvider3(ArrayList<User> userList) {
        this.userList = userList;
    }

    // 根据指定的规格书查找用户
    @Override
    public ArrayList<User> findUser(IUserSpecification2 compositeSpecification) {
        ArrayList<User> result = new ArrayList<>();
        for (User user : userList) {
            if (compositeSpecification.isSatifiedBy(user)) {
                result.add(user);
            }
        }
        return result;
    }
}
