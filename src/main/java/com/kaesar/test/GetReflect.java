package com.kaesar.test;

/**
 * 获取反射的几种方式
 */
public class GetReflect {

  public static void main(String[] args) throws ClassNotFoundException {
    // 方式一：通过建立对象
    Student stu = new Student();
    stu.name = "kk";
    Class classObj1 = stu.getClass();
    System.out.println(classObj1.getName());

    // 方式二：通过路径-相对路径
    Class classObj2 = Class.forName("com.kaesar.test.Student");
    System.out.println(classObj2.getName());

    // 方式三：通过类名
    Class classObj3 = Student.class;
    System.out.println(classObj3.getName());
  }
}
