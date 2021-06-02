package com.kaesar.designpattern.zen.chp32;

/**
 * 孩童状态
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:15 上午
 */
public class ChildState extends HumanState {
    // 儿童的工作就是玩耍
    @Override
    public void work() {
        System.out.println("儿童的工作就是玩耍！");
        super.human.setState(Human.ADULT_STATE);
    }
}
