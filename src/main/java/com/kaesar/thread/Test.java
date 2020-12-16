package com.kaesar.thread;

public class Test {

  public static final String A = "ab"; // 常量A
  public static final String B = "cd"; // 常量B

  public static final String C; // 常量C
  public static final String D;    // 常量D

  static {
    C = "ab";
    D = "cd";
  }

  public static void main(String[] args) {
    String s = A + B;  // 将两个常量用+连接对s进行初始化
    String ss = C + D;  // 将两个常量用+连接对s进行初始化
    String t = "abcd";
    if (s == t) {
      System.out.println("s等于t，它们是同一个对象");
    } else {
      System.out.println("s不等于t，它们不是同一个对象");
    }
    if (ss == t) {
      System.out.println("ss等于t，它们是同一个对象");
    } else {
      System.out.println("ss不等于t，它们不是同一个对象");
    }


    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = "Hel" + "lo";
    String s4 = "Hel" + new String("lo");
    String s5 = new String("Hello");
    String s6 = s5.intern();
    String s7 = "H";
    String s8 = "ello";
    String s9 = s7 + s8;

    System.out.println(s1 == s2);  // true
    System.out.println(s1 == s3);  // true
    System.out.println(s1 == s4);  // false
    System.out.println(s1 == s9);  // false
    System.out.println(s4 == s5);  // false
    System.out.println(s1 == s6);  // true
  }
}
