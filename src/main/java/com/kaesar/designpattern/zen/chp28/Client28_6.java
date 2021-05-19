package com.kaesar.designpattern.zen.chp28;

/**
 * @Author: chengk
 * @Date: 2021/5/18 11:30 下午
 */
public class Client28_6 {
    public static void main(String[] args) {
        // 初始化对象池
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
            // 初始化地址
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + j;
                SignInfo4PoolFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfo4PoolFactory.getSignInfo("科目1考试地点1");
    }
}
