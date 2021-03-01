package com.kaesar.designpattern.zen;

public class Handgun extends AbstractGun {
  // 手枪的特点是携带方便，射程短
  @Override
  public void shoot() {
    System.out.println("手枪射击...");
  }
}
