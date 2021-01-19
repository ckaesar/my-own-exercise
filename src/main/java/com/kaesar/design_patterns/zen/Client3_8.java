package com.kaesar.design_patterns.zen;

public class Client3_8 {
  public static void main(String[] args) {
    IDriver zhangSan = new Driver();
    ICar benz = new Benz();
    // 张三在开奔驰
    zhangSan.driver(benz);

    ICar bmw = new BMW();
    // 张三开宝马
    zhangSan.driver(bmw);
  }
}
