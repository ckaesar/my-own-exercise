package com.kaesar.designpattern.zen;

public class Snipper {
  // 定义士兵的枪支
  private AUG gun;

  // 给士兵一支枪
  public void setRifle(AUG _gun) {
    this.gun = _gun;
  }

  // 狙击手射击
  public void killEnemy() {
    // 首先看看敌人的情况，别杀死敌人，自己也被人干掉
    gun.zoomOut();
    // 开始射击
    gun.shoot();
  }
}
