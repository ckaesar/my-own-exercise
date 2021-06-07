package com.kaesar.designpattern.zen.chp33;

import java.util.Random;

/**
 * 税收
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:19 上午
 */
public class Taxs {
    // 收取多少税金
    public int getTaxs() {
        // 缴纳一个随机数量的税金
        return (new Random()).nextInt(300);
    }
}
