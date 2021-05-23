package com.kaesar.designpattern.zen.chp31;

/**
 * 运动员跑步
 *
 * @Author: chengk
 * @Date: 2021/5/23 12:30 下午
 */
public class Runner implements IRunner {
    @Override
    public void run() {
        System.out.println("运动员跑步：动作很潇洒");
    }
}
