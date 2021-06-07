package com.kaesar.designpattern.zen.chp35;

/**
 * 扣款策略一
 *
 * @Author: chengk
 * @Date: 2021/6/7 6:24 上午
 */
public class SteadyDeduction implements IDeduction {
    // 固定性交易扣款
    @Override
    public boolean exec(Card card, Trade trade) {
        // 固定金额和自有金额各扣除50%
        int halfMoney = (int) Math.rint(trade.getAmount() / 2.0);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        return true;
    }
}
