package com.kaesar.designpattern.zen.chp29;

/**
 * 抽象公司类
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:19 下午
 */
public abstract class AbstractCorp {
    // 定义一个抽象的产品对象，不知道具体是什么产品
    private Product product;

    // 构造函数，由子类定义传递具体的产品进来
    public AbstractCorp(Product product) {
        this.product = product;
    }

    // 公司是干什么的？赚钱的!
    public void makeMoney() {
        // 每家公司都是一样，先生产
        this.product.beProducted();

        // 然后销售
        this.product.beSelled();
    }
}
