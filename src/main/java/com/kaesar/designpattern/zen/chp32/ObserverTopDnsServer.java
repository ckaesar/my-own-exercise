package com.kaesar.designpattern.zen.chp32;

/**
 * 全球顶级DNS服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:01 下午
 */
public class ObserverTopDnsServer extends ObserverDnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("全球顶级DNS服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        // 所有的域名最终的解析地点
        return true;
    }
}
