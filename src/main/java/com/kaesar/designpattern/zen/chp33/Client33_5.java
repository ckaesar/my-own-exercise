package com.kaesar.designpattern.zen.chp33;

/**
 * @Author: chengk
 * @Date: 2021/5/29 12:36 下午
 */
public class Client33_5 {
    public static void main(String[] args) {
        // 创建一封TEXT格式的邮件
        MailTemplate m = new HtmlMail("a@a.com", "b@b.com", "外星人攻击地球了", "来了！！！");
        // 创建一个Mail发送程序
        MailServer mail = new MailServer(m);
        // 发送邮件
        mail.sendMail();
    }
}
