package com.kaesar.designpattern.zen.chp32;

/**
 * @Author: chengk
 * @Date: 2021/5/23 2:52 下午
 */
public class Client32_5 {
    public static void main(String[] args) {
        // 定义环境角色
        Context context;
        // 对文件执行zip压缩算法
        System.out.println("===执行算法===");
        context = new Context(new Zip());
        /**
         * 算法替换
         * context = new Context(new Gzip());
         */
        // 执行压缩算法
        context.compress("c:\\windows", "d:\\windows.zip");
        // 执行解压缩算法
        context.uncompress("c:\\windows.zip", "d:\\windows");
    }
}
