package com.kaesar.designpattern.zen.chp32;

/**
 * 人的抽象状态
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:10 上午
 */
public abstract class HumanState {
    // 指向一个具体的人
    protected Human human;

    // 设置一个具体的人
    public void setHuman(Human _human) {
        this.human = _human;
    }

    // 不管人是什么状态都要工作
    public abstract void work();
}
