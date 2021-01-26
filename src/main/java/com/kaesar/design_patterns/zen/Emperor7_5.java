package com.kaesar.design_patterns.zen;

import java.util.ArrayList;
import java.util.Random;

public class Emperor7_5 {
  // 定义做多能产生的实例数量
  private static int maxNumOfEmperor = 2;
  // 每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
  private static ArrayList<String> nameList = new ArrayList<>();
  // 定义一个列表，容纳所有的皇帝实例
  private static ArrayList<Emperor7_5> emperorList = new ArrayList<>();
  // 当前皇帝序列号
  private static int countNumOfEmperor = 0;

  // 产生所有的对象
  static {
    for (int i = 0; i < maxNumOfEmperor; i++) {
      emperorList.add(new Emperor7_5("皇" + (i + 1) + "帝"));
    }
  }

  private Emperor7_5() {
    // 世俗和道德约束你，目的就是不产生第二个皇帝
  }

  // 传入皇帝名称，建立一个皇帝对象
  private Emperor7_5(String name) {
    nameList.add(name);
  }

  // 随机获得一个皇帝对象
  public static Emperor7_5 getInstance() {
    Random random = new Random();
    // 随机拉出一个皇帝，只要是个精神领袖就行
    countNumOfEmperor = random.nextInt(maxNumOfEmperor);
    return emperorList.get(countNumOfEmperor);
  }

  // 皇帝发话了
  public static void say() {
    System.out.println(nameList.get(countNumOfEmperor));
  }
}
