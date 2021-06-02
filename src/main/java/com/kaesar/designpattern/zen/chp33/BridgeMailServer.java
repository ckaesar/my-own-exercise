package com.kaesar.designpattern.zen.chp33;

/**
 * 邮件服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:30 下午
 */
public abstract class BridgeMailServer {
    // 发送的是哪封邮件
    protected final BridgeMailTemplate m;

    public BridgeMailServer(BridgeMailTemplate _m) {
        this.m = _m;
    }

    // 发送邮件
    public void sendMail() {
        System.out.println("=====正在发送的邮件信息=====");
        // 发件人
        System.out.println("发件人：" + m.getFrom());
        // 收件人
        System.out.println("收件人：" + m.getTo());
        // 标题
        System.out.println("邮件标题：" + m.getSubject());
        // 邮件内容
        System.out.println("邮件内容：" + m.getContext());
    }
}
