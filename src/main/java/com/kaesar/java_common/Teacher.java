package com.kaesar.java_common;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Teacher implements Serializable {
  private String name;

  private Person person;

  public Teacher(String name, Person person) {
    this.name = name;
    this.person = person;
  }

  public static void main(String[] args) {
    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"));
      Person person = new Person("羽仙", 20);
      Teacher teacher = new Teacher("凯撒", person);
      oos.writeObject(teacher);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
