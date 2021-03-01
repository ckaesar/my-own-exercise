package com.kaesar.designpattern;

public enum EnumSingleton {

  INSTANCE;

  public EnumSingleton getInstance() {
    return INSTANCE;
  }
}
