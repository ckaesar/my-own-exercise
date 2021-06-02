package com.kaesar.designpattern.zen.chp33;

/**
 * 职位
 *
 * @Author: chengk
 * @Date: 2021/5/29 1:00 下午
 */
public class Position extends AbsColleague implements IPosition {
    public Position(AbsMediator _mediator) {
        super(_mediator);
    }

    @Override
    public void promote() {
        super.mediator.up(this);
    }

    @Override
    public void demote() {
        super.mediator.down(this);
    }
}
