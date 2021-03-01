package com.kaesar.designpattern.zen;

public class Driver implements IDriver {
  // 司机的主要职责就是驾驶汽车
  public void driver(ICar car) {
    car.run();
  }
}
