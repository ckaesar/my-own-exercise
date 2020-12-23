package com.kaesar.java_common;

public class HashCodeTest {

  public static void main(String[] args) {
    AHash aHash = new AHash(1, 2);
    BHash bHash = new BHash(2, 1);
    BHash bHash1 = new BHash(1, 2);
    BHash bHash2 = new BHash(2, 1);
    System.out.println(aHash.hashCode() == bHash.hashCode());
    System.out.println(aHash.equals(bHash));
    System.out.println(bHash.equals(bHash1));
    System.out.println(bHash.equals(bHash2));
  }
}
