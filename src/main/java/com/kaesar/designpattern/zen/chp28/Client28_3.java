package com.kaesar.designpattern.zen.chp28;

/**
 * @Author: chengk
 * @Date: 2021/5/18 11:18 下午
 */
public class Client28_3 {
    public static void main(String[] args) {
        // 从工厂中获得一个对象
        SignInfo signInfo = SignInfoFactory.getSignInfo();
        // 进行其他业务处理
    }
}
