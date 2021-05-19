package com.kaesar.designpattern.zen.chp28;

/**
 * @Author: chengk
 * @Date: 2021/5/18 11:51 下午
 */
public class Client28_12 {
    public static void main(String[] args) {
        // 在对象池中初始化4个对象
        SignInfo4PoolFactory.getSignInfo("科目1");
        SignInfo4PoolFactory.getSignInfo("科目2");
        SignInfo4PoolFactory.getSignInfo("科目3");
        SignInfo4PoolFactory.getSignInfo("科目4");
        // 取得对象
        SignInfo signInfo = SignInfo4PoolFactory.getSignInfo("科目2");
        while (true) {
            signInfo.setId("张三");
            signInfo.setLocation("地址");
            new MultiThread(signInfo).start();
            signInfo.setId("李四");
            signInfo.setLocation("地址2");
            new MultiThread(signInfo).start();
        }
    }
}
