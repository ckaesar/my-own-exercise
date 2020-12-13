package com.kaesar.test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

  public static void main(String[] args) {
    List<String> arrayList1 = new ArrayList<>();
    arrayList1.add("1");
    arrayList1.add("2");
    for (String s : arrayList1) {
      if ("1".equals(s)) {
        arrayList1.remove(s);
      }
    }

    List<String> arrayList2 = new ArrayList<>();
    arrayList2.add("2");
    arrayList2.add("1");
    for (String s : arrayList2) {
      if ("1".equals(s)) {
        arrayList2.remove(s);
      }
    }
  }
}
