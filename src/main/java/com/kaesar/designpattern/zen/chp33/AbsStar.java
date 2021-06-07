package com.kaesar.designpattern.zen.chp33;

/**
 * 抽象明星
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:57 上午
 */
public abstract class AbsStar {
    // 一个明星参加哪些活动
    protected final AbsAction action;

    // 通过构造函数传递具体活动
    public AbsStar(AbsAction _action) {
        this.action = _action;
    }

    // 每个明星都有自己的主要工作
    public void doJob() {
        action.desc();
    }
}
