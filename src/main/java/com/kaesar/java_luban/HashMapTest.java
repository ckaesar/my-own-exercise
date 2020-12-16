package com.kaesar.java_luban;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {

  public static void main(String[] args) {
    HashMap<String, String> hashMap = new HashMap<>(); // 数组+链表
    hashMap.put("123", "2"); // key-value, Entry
    hashMap.get("123");

    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    concurrentHashMap.put("123", "122");
  }
}
