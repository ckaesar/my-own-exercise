package com.kaesar.test;

import java.lang.reflect.Constructor;

public class TestReflect {

  public static void main(String[] args) throws Exception {
    Class clazz = null;
    clazz = Class.forName("com.kaesar.test.Student");
    Constructor<Student> constructor1 = clazz.getConstructor();
    Constructor<Student> constructor2 = clazz.getConstructor(String.class);

    Student student1 = constructor1.newInstance();
    Student student2 = constructor2.newInstance("kk");
  }
}
