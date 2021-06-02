package com.kaesar.designpattern.zen.chp32;

/**
 * 中国顶级DNS服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:38 上午
 */
public class ChinaTopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("中国顶级DNS服务器");
        return recorder;
    }
}
