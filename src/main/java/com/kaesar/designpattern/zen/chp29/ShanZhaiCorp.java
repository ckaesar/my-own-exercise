package com.kaesar.designpattern.zen.chp29;

/**
 * 山寨公司
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:23 下午
 */
public class ShanZhaiCorp extends AbstractCorp {
    // 产什么产品，不知道，等被调用的时候才知道
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    // 狂赚钱
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
