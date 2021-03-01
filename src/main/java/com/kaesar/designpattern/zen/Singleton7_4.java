package com.kaesar.designpattern.zen;

public class Singleton7_4 {
  private static Singleton7_4 singleton = null;

  // 限制产生多个对象
  private Singleton7_4() {

  }

  // 通过该方法获得实例对象
  public static Singleton7_4 getSingleton() {
    if (singleton == null) {
      singleton = new Singleton7_4();
    }
    return singleton;
  }
}
