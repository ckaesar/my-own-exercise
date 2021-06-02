package com.kaesar.designpattern.zen.chp33;

/**
 * 抽象同事类
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:51 下午
 */
public abstract class AbsColleague {
    // 每个同事类都对中介者非常了解
    protected AbsMediator mediator;

    public AbsColleague(AbsMediator _mediator) {
        this.mediator = _mediator;
    }
}
