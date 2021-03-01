package com.kaesar.designpattern;

public class LHanSingleton {
  private static LHanSingleton instance;

  private LHanSingleton() {

  }

  public static LHanSingleton getInstance() {
    if (instance == null) {
      instance = new LHanSingleton();
    }
    return instance;
  }
}
