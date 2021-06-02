package com.kaesar.designpattern.zen.chp33;

/**
 * 工资
 *
 * @Author: chengk
 * @Date: 2021/5/29 1:01 下午
 */
public class Salary extends AbsColleague implements ISalary {
    public Salary(AbsMediator _mediator) {
        super(_mediator);
    }

    @Override
    public void increaseSalary() {
        super.mediator.up(this);
    }

    @Override
    public void decreaseSalary() {
        super.mediator.down(this);
    }
}
