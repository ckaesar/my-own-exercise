package com.kaesar.designpattern.zen.chp14;

/**
 * 抽象同事类
 */
public class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
