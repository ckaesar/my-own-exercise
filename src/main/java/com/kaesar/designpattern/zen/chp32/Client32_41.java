package com.kaesar.designpattern.zen.chp32;

/**
 * @Author: chengk
 * @Date: 2021/5/29 12:02 下午
 */
public class Client32_41 {
    public static void main(String[] args) throws Exception {
        // 上海域名服务器
        ObserverDnsServer sh = new ObserverSHDnsServer();
        // 中国顶级域名服务器
        ObserverDnsServer china = new ObserverChinaTopDnsServer();
        // 全球顶级域名服务器
        ObserverDnsServer top = new ObserverTopDnsServer();

        // 定义查询路径
        china.setUpperServer(top);
        sh.setUpperServer(china);

        // 解析域名
        System.out.println("=====域名解析模拟器=====");
        Recorder recorder = new Recorder();
        recorder.setDomain("www.baidu.org");
        sh.update(null, recorder);
        System.out.println("=====DNS服务器解析结果=====");
        System.out.println(recorder);
    }
}
