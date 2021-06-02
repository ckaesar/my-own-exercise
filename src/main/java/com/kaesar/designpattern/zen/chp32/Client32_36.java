package com.kaesar.designpattern.zen.chp32;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: chengk
 * @Date: 2021/5/29 11:41 上午
 */
public class Client32_36 {
    public static void main(String[] args) throws Exception {
        // 上海域名服务器
        DnsServer sh = new SHDnsServer();
        // 中国顶级域名服务器
        DnsServer china = new ChinaTopDnsServer();
        // 全球顶级域名服务器
        DnsServer top = new TopDnsServer();
        // 定义查询路径
        china.setUpperServer(top);
        sh.setUpperServer(china);

        // 解析域名
        System.out.println("=====域名解析模拟器=====");
        System.out.println("\n请输入域名（输入N退出）：");
        String domain = "test.com.cn";
        Recorder recorder = sh.resolve(domain);
        System.out.println("=====DNS服务器解析结果=====");
        System.out.println(recorder);
    }
}
