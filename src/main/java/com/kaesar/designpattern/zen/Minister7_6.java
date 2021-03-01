package com.kaesar.designpattern.zen;

public class Minister7_6 {
  public static void main(String[] args) {
    // 定义5个大臣
    int ministerNum = 5;
    for (int i = 0; i < ministerNum; i++) {
      Emperor7_5 emperor = Emperor7_5.getInstance();
      System.out.print("第" + (i + 1) + "个大臣参拜的是：");
      emperor.say();
    }
  }
}
