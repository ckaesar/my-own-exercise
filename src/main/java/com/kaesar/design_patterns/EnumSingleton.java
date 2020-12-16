package com.kaesar.design_patterns;

public enum EnumSingleton {

  INSTANCE;

  public EnumSingleton getInstance() {
    return INSTANCE;
  }
}
