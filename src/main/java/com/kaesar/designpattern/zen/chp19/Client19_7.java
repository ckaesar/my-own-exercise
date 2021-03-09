package com.kaesar.designpattern.zen.chp19;

public class Client19_7 {
    public static void main(String[] args) {
        // 老板一想不对呀，兔子不吃窝边草，还是找借用人员好点
        // 我们只修改了这句话
        IUserInfo youngGirl = new OutUserInfo();
        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
