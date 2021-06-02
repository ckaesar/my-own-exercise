package com.kaesar.designpattern.zen.chp33;

/**
 * Postfix邮件服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:45 下午
 */
public class Postfix extends BridgeMailServer {
    public Postfix(BridgeMailTemplate _m) {
        super(_m);
    }

    // 修正邮件发送程序
    @Override
    public void sendMail() {
        String context = "Received: from XXXX";
        super.m.setContext(m.getContext() + context);
        super.sendMail();
    }
}
