package com.kaesar.java_common;

import java.io.Serializable;

public class Person implements Serializable {
  private String name;

  private int age;

  public Person(String name, int age) {
    System.out.println("有参构造方法");
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + "'" + ", age=" + age + "}";
  }

  public static void main(String[] args) {
    Person person = new Person("k", 20);
    System.out.println(person.toString());
  }
}
