package com.kaesar.design_patterns.zen.chp14;

/**
 * 修改后采购管理
 */
public class Purchase1 extends AbstractColleague {

    public Purchase1(AbstractMediator _mediator) {
        super(_mediator);
    }

    // 采购IBM电脑
    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
