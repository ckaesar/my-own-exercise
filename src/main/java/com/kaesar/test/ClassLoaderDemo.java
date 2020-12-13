package com.kaesar.test;

import com.sun.crypto.provider.DESKeyFactory;

import java.util.HashMap;

public class ClassLoaderDemo {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    Demo1 demo1 = new Demo1();
    System.out.println(DESKeyFactory.class.getClassLoader());
    System.out.println(map.getClass().getClassLoader());
    System.out.println(demo1.getClass().getClassLoader());
  }
}
