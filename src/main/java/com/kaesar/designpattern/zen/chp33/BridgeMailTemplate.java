package com.kaesar.designpattern.zen.chp33;

import lombok.Data;

/**
 * 桥接模式-邮件模板
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:40 下午
 */
@Data
public abstract class BridgeMailTemplate {
    // 邮件发送人
    private String from;

    // 邮件接收人
    private String to;

    // 邮件标题
    private String subject;

    // 邮件内容
    private String context;

    // 通过构造函数传递邮件信息
    public BridgeMailTemplate(String _from, String _to, String _subject, String _context) {
        this.from = _from;
        this.to = _to;
        this.subject = _subject;
        this.context = _context;
    }

    public void add(String sendInfo) {
        context = sendInfo + context;
    }
}
