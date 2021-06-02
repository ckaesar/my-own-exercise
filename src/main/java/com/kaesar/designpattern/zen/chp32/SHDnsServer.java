package com.kaesar.designpattern.zen.chp32;

/**
 * 上海DNS服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:36 上午
 */
public class SHDnsServer extends DnsServer {
    // 定义上海的DNS服务器能处理的级别
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("上海DNS服务器");
        return recorder;
    }
}
