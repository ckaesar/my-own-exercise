package com.kaesar.designpattern.zen.chp33;

import lombok.Data;

/**
 * 抽象邮件
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:24 下午
 */
@Data
public abstract class MailTemplate {
    // 邮件发送人
    private String from;

    // 邮件接收人
    private String to;

    // 邮件标题
    private String subject;

    // 邮件内容
    private String context;

    // 通过构造函数传递邮件信息
    public MailTemplate(String _from, String _to, String _subject, String _context) {
        this.from = _from;
        this.to = _to;
        this.subject = _subject;
        this.context = _context;
    }
}
