package com.kaesar.designpattern.zen.chp35;

import lombok.Data;

/**
 * IC卡类
 *
 * @Author: chengk
 * @Date: 2021/6/7 6:17 上午
 */
@Data
public class Card {
    // IC卡号码
    private String cardNo = "";
    // 卡内的固定交易金额
    private int steadyMoney = 0;
    // 卡内的自由交易金额
    private int freeMoney = 0;
}
