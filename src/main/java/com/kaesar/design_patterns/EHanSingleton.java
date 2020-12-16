package com.kaesar.design_patterns;

public class EHanSingleton {

  private static EHanSingleton instance = new EHanSingleton();

  private EHanSingleton() {

  }

  public static EHanSingleton getInstance() {
    return instance;
  }
}
