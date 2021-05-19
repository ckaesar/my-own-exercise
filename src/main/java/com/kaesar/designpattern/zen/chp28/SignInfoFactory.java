package com.kaesar.designpattern.zen.chp28;

/**
 * 报考信息工厂
 *
 * @Author: chengk
 * @Date: 2021/5/18 11:17 下午
 */
public class SignInfoFactory {
    // 报名信息的对象工厂
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }
}
