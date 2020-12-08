package com.kaesar.test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OutOfMemoryDump {

  /**
   * JVM参数
   * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=../test.dump
   */
  public static void main(String[] args) {
    List<Object> list = new ArrayList<>();
    int i = 0;
    while(true) {
      list.add(new User(i++, UUID.randomUUID().toString()));
      i++;
    }
  }
}
