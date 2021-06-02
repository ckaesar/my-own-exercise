package com.kaesar.designpattern.zen.chp32;

/**
 * 全球顶级DNS服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:40 上午
 */
public class TopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        // 所有的域名最终的解析地点
        return true;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("全球顶级DNS服务器");
        return recorder;
    }
}
