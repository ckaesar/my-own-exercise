package com.kaesar.designpattern.zen.chp32;

import java.util.Random;

/**
 * 抽象域名解析器
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:30 上午
 */
public abstract class DnsServer {
    // 上级DNS是谁
    private DnsServer upperServer;

    // 解析域名
    public final Recorder resolve(String domain) {
        Recorder recorder = null;
        if (isLocal(domain)) {
            // 是本服务器能解析的域名
            recorder = echo(domain);
        } else {
            // 本服务器不能解析
            // 提交上级DNS进行解析
            recorder = upperServer.resolve(domain);
        }
        return recorder;
    }

    // 指向上级DNS
    public void setUpperServer(DnsServer _upperServer) {
        this.upperServer = _upperServer;
    }

    // 每个DNS都有一个数据处理区（ZONE），检查域名是否在本区内
    protected abstract boolean isLocal(String domain);

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        // 获得IP地址
        recorder.setIp(getIpAddress());
        recorder.setDomain(domain);
        return recorder;
    }

    private String getIpAddress() {
        Random random = new Random();
        String address = random.nextInt(255) + "." +
                random.nextInt(255) + "." +
                random.nextInt(255) + "." +
                random.nextInt(255);
        return address;
    }
}
