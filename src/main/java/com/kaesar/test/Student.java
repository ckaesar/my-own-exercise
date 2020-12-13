package com.kaesar.test;

public class Student {

  private int id;
  String name;
  protected boolean sex;
  public float score;

  public Student() {
    System.out.println("无参构造器。。。");
  }

  public Student(String name) {
    System.out.println("参数构造器。。。" + name);
  }

  public void test () {

  }
}
