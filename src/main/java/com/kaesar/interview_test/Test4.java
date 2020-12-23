package com.kaesar.interview_test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test4 {

  public static void main(String[] args) {
    Map<String, String> hashMap = new HashMap<>();
    Map<String, String> treeMap = new TreeMap<>();
    for (int i = 0; i < 10; i++) {
      String key = (int)(Math.random() * 10) + "";
      String value = i + "";
      System.out.print("[" + key + ":" + value + "]" + ".");
      treeMap.put(key, value);
    }
    System.out.println();

    for (String key : treeMap.keySet()) {
      System.out.print("[" + key + ":" + treeMap.get(key) + "]" + ".");
    }

  }
}
