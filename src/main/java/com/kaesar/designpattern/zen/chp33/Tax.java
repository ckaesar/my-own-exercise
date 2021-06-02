package com.kaesar.designpattern.zen.chp33;

/**
 * 税收
 *
 * @Author: chengk
 * @Date: 2021/5/29 1:03 下午
 */
public class Tax extends AbsColleague implements ITax {
    public Tax(AbsMediator _mediator) {
        super(_mediator);
    }

    @Override
    public void raise() {
        super.mediator.up(this);
    }

    @Override
    public void drop() {
        super.mediator.down(this);
    }
}
