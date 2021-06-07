package com.kaesar.designpattern.zen.chp35;

import lombok.Data;

/**
 * 交易类
 *
 * @Author: chengk
 * @Date: 2021/6/7 6:19 上午
 */
@Data
public class Trade {
    // 交易编号
    private String tradeNo = "";
    // 交易金额
    private int amount = 0;
}
