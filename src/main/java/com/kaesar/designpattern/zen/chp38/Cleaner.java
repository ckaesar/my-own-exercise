package com.kaesar.designpattern.zen.chp38;

/**
 * 抽象的清洁者
 *
 * @Author: chengk
 * @Date: 2021/6/13 2:24 下午
 */
public class Cleaner {
    // 清洁
    public void clean(Cleanable clean) {
        clean.cleaned();
    }
}
