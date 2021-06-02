//package com.kaesar.jvm_zzm.chp12;
//
//import org.springframework.data.convert.ConfigurableTypeInformationMapper;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 指令重排序
// *
// * @Author: chengk
// * @Date: 2021/5/29 1:59 下午
// */
//public class Test12_4 {
//    Map configText;
//    // 此变量必须定义为volatile
//    volatile boolean initialized = false;
//
//    public void test1() {
//        // 假设以下代码在线程A中执行
//        // 模拟读取配置信息，当读取完成后
//        // 将initialized设置为true，通知其他线程配置可用
//        Map configOptions = new HashMap();
//        configText = readConfigFile(fileName);
//        processConfigOptions(configText, configOptions);
//        initialized = true;
//    }
//
//    public void test2() {
//        // 假设以下代码在线程B中执行
//        // 等待initialized为true，代表线程A已经把配置信息初始化完成
//        while (!initialized) {
//            Thread.sleep(1000);
//        }
//
//        // 使用线程A中初始化好的配置信息
//        doSomethingWithConfig();
//    }
//
//
//}
