package com.kaesar.designpattern.zen.chp35;

/**
 * 扣款策略二
 *
 * @Author: chengk
 * @Date: 2021/6/7 6:29 上午
 */
public class FreeDeduction implements IDeduction {
    // 自由扣款
    @Override
    public boolean exec(Card card, Trade trade) {
        // 直接从自由余额中扣除
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
