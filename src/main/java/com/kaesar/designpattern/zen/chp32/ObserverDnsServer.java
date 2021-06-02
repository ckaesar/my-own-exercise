package com.kaesar.designpattern.zen.chp32;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * 观察者模式下的抽象DNS服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:51 上午
 */
public abstract class ObserverDnsServer extends Observable implements Observer {
    // 处理请求，也就是接收到事件后的处理
    @Override
    public void update(Observable arg0, Object arg1) {
        Recorder recorder = (Recorder) arg1;
        // 如果本机能解析
        if (isLocal(recorder)) {
            recorder.setIp(getIpAddress());
        } else {
            // 本机不能解析，则提交到上级DNS
            responsFromUpperServer(recorder);
        }
        sign(recorder);
    }

    // 作为被观察者，允许增加观察者，这里上级DNS一般只有一个
    public void setUpperServer(ObserverDnsServer dnsServer) {
        // 先清空，然后再增加
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    // 向父DNS请求解析，也就是通知观察者
    private void responsFromUpperServer(Recorder recorder) {
        super.setChanged();
        super.notifyObservers(recorder);
    }

    // 每个DNS服务器签上自己的名字
    protected abstract void sign(Recorder recorder);

    // 每个DNS都必须定义自己的处理级别
    protected abstract boolean isLocal(Recorder recorder);

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        // 获得IP地址
        recorder.setIp(getIpAddress());
        recorder.setDomain(domain);
        return recorder;
    }


    // 随机产生一个IP地址，工具类
    private String getIpAddress() {
        Random random = new Random();
        String address = random.nextInt(255) + "." +
                random.nextInt(255) + "." +
                random.nextInt(255) + "." +
                random.nextInt(255);
        return address;
    }
}
