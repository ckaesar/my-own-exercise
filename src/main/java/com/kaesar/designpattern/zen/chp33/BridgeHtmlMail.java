package com.kaesar.designpattern.zen.chp33;

import lombok.Data;

/**
 * 超文本邮件
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:27 下午
 */
public class BridgeHtmlMail extends BridgeMailTemplate {
    public BridgeHtmlMail(String _from, String _to, String _subject, String _context) {
        super(_from, _to, _subject, _context);
    }

    @Override
    public String getContext() {
        // 超文本类型设置邮件的格式为：multipart/mixed
        String context = "\nContent-Type: multipart/mixed;charset=GB2312\n" + super.getContext();
        context = context + "\n邮件格式为：超文本格式";
        return context;
    }
}
