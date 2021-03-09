package com.kaesar.designpattern.zen.chp19;

public class Client19_6 {
    public static void main(String[] args) {
        // 没有余外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        // 从数据库中查到101个
        for (int i = 0; i < 10; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
