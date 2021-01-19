package com.kaesar.design_patterns.zen;

public class Client {
  public static void main(String[] args) {
    // 产生三毛这个士兵
    Soldier sanMao = new Soldier();
    // 给三毛一支枪
    sanMao.setGun(new Rifle());
    sanMao.killEnemy();

    // 给三毛玩具枪
    sanMao.setGun(new ToyGun());
    sanMao.killEnemy();

    // 产生四条这个狙击手
    Snipper siTiao = new Snipper();
    siTiao.setRifle(new AUG());
    siTiao.killEnemy();

    // 类型转换异常
    siTiao.setRifle((AUG) new Rifle());
    siTiao.killEnemy();
  }
}
