package com.kaesar.designpattern.zen.chp31;

/**
 * 外形美化
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:16 下午
 */
public class BeautifyAppearance extends Decorator {
    // 要美化谁
    public BeautifyAppearance(Swan swan) {
        super(swan);
    }

    // 外表美化处理
    public void desAppearance() {
        System.out.println("外表是纯白色的，非常惹人喜爱");
    }
}
