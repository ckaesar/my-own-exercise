package com.kaesar.designpattern.zen.chp38;

import java.util.ArrayList;

/**
 * @Author: chengk
 * @Date: 2021/6/13 1:00 下午
 */
public class Client38_21 {
    public static void main(String[] args) {
        // 首先初始化一批用户
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("苏国庆", 3));
        userList.add(new User("国庆牛", 8));
        userList.add(new User("张国庆三", 10));
        userList.add(new User("李四", 15));
        userList.add(new User("王五", 18));
        userList.add(new User("赵六", 20));
        userList.add(new User("马七", 25));
        userList.add(new User("杨八", 30));
        userList.add(new User("候九", 35));
        userList.add(new User("布十", 40));

        // 定义一个用户查询类
        IUserProvider3 userProvider = new UserProvider3(userList);
        // 打印出名字包含"国庆"的用户
        System.out.println("=====名字包含 国庆 的人员=====");
        IUserSpecification2 spec = new UserByNameLike2("%国庆%");
        IUserSpecification2 spec2 = new UserByAgeThan2(3);
        for (User user : userProvider.findUser(spec.and(spec2))) {
            System.out.println(user);
        }
    }
}
