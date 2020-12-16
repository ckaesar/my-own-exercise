package com.kaesar.design_patterns;

public class StaticInnerClassSingleton {

  private static class SingletonHolder {
    private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
  }

  private StaticInnerClassSingleton() {

  }

  private static final StaticInnerClassSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
}
