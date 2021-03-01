package com.kaesar.designpattern.zen.chp14;

import java.util.Random;

/**
 * 修改后的销售管理
 */
public class Sale1 extends AbstractColleague {
    public Sale1(AbstractMediator _mediator) {
        super(_mediator);
    }

    // 销售IBM电脑
    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑" + number + "台");
    }

    // 反馈销售情况，0~100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    // 折价处理
    public void offSale() {
        // 库房有多少卖多少
        super.mediator.execute("sale.offsell");
    }
}
