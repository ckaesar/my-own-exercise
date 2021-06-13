package com.kaesar.designpattern.zen.chp38;

import java.util.ArrayList;

/**
 * @Author: chengk
 * @Date: 2021/6/13 1:00 下午
 */
public class Client38_11 {
    public static void main(String[] args) {
        // 首先初始化一批用户
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("苏大", 3));
        userList.add(new User("牛二", 8));
        userList.add(new User("张三", 10));
        userList.add(new User("李四", 15));
        userList.add(new User("王五", 18));
        userList.add(new User("赵六", 20));
        userList.add(new User("马七", 25));
        userList.add(new User("杨八", 30));
        userList.add(new User("候九", 35));
        userList.add(new User("布十", 40));

        // 定义一个用户查询类
        IUserProvider2 userProvider = new UserProvider2(userList);
        // 打印出年龄大于20岁的用户
        System.out.println("=====年龄大于20岁的用户=====");
        IUserSpecification userSpecification = new UserByAgeThan(20);
        for (User user : userProvider.findUser(userSpecification)) {
            System.out.println(user);
        }
    }
}
