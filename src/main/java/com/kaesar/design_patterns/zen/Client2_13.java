package com.kaesar.design_patterns.zen;

import java.util.HashMap;
import java.util.Map;

public class Client2_13 {
  public static void invoker() {
    // 父类存在的地方，子类就应该能够存在
    Father f = new Father();
    HashMap map = new HashMap();
    f.doSomething(map);

    // 父类存在的地方，子类就应该能够存在
    Son s = new Son();
    HashMap map1 = new HashMap();
    s.doSomething(map1);

    Son s2 = new Son();
    Map map2 = new HashMap();
    s2.doSomething(map2);
  }

  public static void main(String[] args) {
    invoker();
  }
}
