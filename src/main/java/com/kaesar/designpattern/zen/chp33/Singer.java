package com.kaesar.designpattern.zen.chp33;

/**
 * 明星
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:33 上午
 */
public class Singer implements IStar {
    @Override
    public void sign() {
        System.out.println("明星签名：我是小仙女");
    }
}
