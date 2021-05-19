package com.kaesar.designpattern.zen.chp28;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.RandomSeq;

import java.util.HashMap;

/**
 * @Author: chengk
 * @Date: 2021/5/18 11:47 下午
 */
public class SighInfoFactoryThread {
    // 池容器
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    // 从池中获得对象
    public static SignInfo getSignInfo(String key) {
        // 设置返回对象
        SignInfo result = null;
        // 池中没有该对象，则建立，并放入池中
        if (!pool.containsKey(key)) {
            result = new SignInfo();
            pool.put(key, result);
        } else {
            result = pool.get(key);
        }
        return result;
    }
}
