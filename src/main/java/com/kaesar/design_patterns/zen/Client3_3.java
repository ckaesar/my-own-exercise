package com.kaesar.design_patterns.zen;

public class Client3_3 {
  public static void main(String[] args) {
    Driver zhangSan = new Driver();
    Benz benz = new Benz();
    // 张三开奔驰车
    zhangSan.driver(benz);
  }
}
