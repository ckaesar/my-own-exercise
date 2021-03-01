package com.kaesar.designpattern.zen;

public class PettyGirl implements IGoodBodyGirl, IGreatTemeramentGirl {
  private String name;

  // 美女都有名字
  public PettyGirl(String _name) {
    this.name = _name;
  }

  // 脸蛋漂亮
  public void goodLooking() {
    System.out.println(this.name + "---脸蛋很漂亮");
  }

  // 身材要好
  public void niceFigure() {
    System.out.println(this.name + "---身材很好");
  }

  // 气质要好
  public void greatTemperament() {
    System.out.println(this.name + "---气质很好");
  }
}
