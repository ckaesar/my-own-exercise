package com.kaesar.designpattern.zen.chp33;

/**
 * 文本邮件
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:27 下午
 */
public class BridgeTextMail extends BridgeMailTemplate {
    public BridgeTextMail(String _from, String _to, String _subject, String _context) {
        super(_from, _to, _subject, _context);
    }

    @Override
    public String getContext() {
        // 文本类型设置邮件的格式为：text/plain
        String context = "\nContent-Type: text/plain;charset=GB2312\n" + super.getContext();
        context = context + "\n邮件格式为：文本格式";
        return context;
    }
}
