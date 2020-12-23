package com.kaesar.java_common;

public class AHash {

  private int a1;
  private int a2;

  public AHash(int a1, int a2) {
    this.a1 = a1;
    this.a2 = a2;
  }

  public int getA1() {
    return a1;
  }

  public void setA1(int a1) {
    this.a1 = a1;
  }

  public int getA2() {
    return a2;
  }

  public void setA2(int a2) {
    this.a2 = a2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AHash aHash = (AHash) o;
    return a1 == aHash.a1 && a2 == aHash.a2;
  }

  @Override
  public int hashCode() {
    return a1 * a2;
  }
}
