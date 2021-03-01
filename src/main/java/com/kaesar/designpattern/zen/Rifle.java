package com.kaesar.designpattern.zen;

public class Rifle extends AbstractGun {
  // 步枪的特点是射程远，威力大
  @Override
  public void shoot() {
    System.out.println("步枪射击...");
  }
}
