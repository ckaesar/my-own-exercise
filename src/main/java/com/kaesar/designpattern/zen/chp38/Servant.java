package com.kaesar.designpattern.zen.chp38;

/**
 * 雇工类
 *
 * @Author: chengk
 * @Date: 2021/6/13 2:28 下午
 */
public class Servant {
    // 服务内容
    public void service(IServiced serviceFuture) {
        serviceFuture.serviced();
    }
}
