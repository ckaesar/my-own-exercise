package com.kaesar.designpattern.zen.chp29;

/**
 * 服装公司
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:06 下午
 */
public class ClothesCorp extends Corp {
    // 服装公司生产的就是衣服了
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服...");
    }

    // 服装公司卖衣服，可只卖服装，不卖穿衣服的模特
    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }

    // 服装公司不景气，但怎么说也是赚钱行业
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}
