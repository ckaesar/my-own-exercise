package com.kaesar.designpattern.zen;

public class PrettyGirl implements IPrettyGirl {
  private String name;

  // 美女都有名字
  public PrettyGirl(String _name) {
    this.name = _name;
  }

  // 脸蛋漂亮
  @Override
  public void goodLooking() {
    System.out.println(this.name + "---脸蛋很漂亮");
  }

  @Override
  public void niceFigure() {
    System.out.println(this.name + "---身材很好");
  }

  @Override
  public void greatTemperament() {
    System.out.println(this.name + "---气质很好");
  }
}
