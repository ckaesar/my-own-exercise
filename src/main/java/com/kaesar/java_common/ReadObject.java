package com.kaesar.java_common;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class ReadObject {

  public static void main(String[] args) {
    try {
      // 创建一个ObjectInputStream输入流
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
      Person person = (Person) ois.readObject();
      System.out.println(person);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
