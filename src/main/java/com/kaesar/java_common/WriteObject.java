package com.kaesar.java_common;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化
 */
public class WriteObject {

  public static void main(String[] args) {
    try {
      // 创建一个ObjectOutputStream输出流
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
      // 将对象序列化到文件
      Person person = new Person("羽仙", 20);
      oos.writeObject(person);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
