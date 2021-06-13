package com.kaesar.designpattern.zen.chp38;

import java.util.ArrayList;

/**
 * 用户操作接口
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:22 下午
 */
public interface IUserProvider3 {
    // 根据条件查账号用户
    public ArrayList<User> findUser(IUserSpecification2 userSpecification2);
}
