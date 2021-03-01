package com.kaesar.designpattern.zen;

public class ToyGun extends AbstractGun {
  // 玩具枪是不能射击的，但是编译器又要求实现这个方法，怎么办？虚构一个呗！
  @Override
  public void shoot() {
    // 玩具枪不能射击，这个方法就不能实现了
  }
}
