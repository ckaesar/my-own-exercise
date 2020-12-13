package com.kaesar.test;

public class CounterGC {

  Object instance = null;

  public static void main(String[] args) {
    CounterGC a = new CounterGC();
    CounterGC b = new CounterGC();
    a.instance = b;
    b.instance = a;
    a = null;
    b = null;
  }
}
