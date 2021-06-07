package com.kaesar.designpattern.zen.chp35;

/**
 * 扣款策略接口
 *
 * @Author: chengk
 * @Date: 2021/6/7 6:22 上午
 */
public interface IDeduction {
    // 扣款，提供交易和卡信息，进行扣款，并返回扣款是否成功
    public boolean exec(Card card, Trade trade);
}
