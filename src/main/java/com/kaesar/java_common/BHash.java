package com.kaesar.java_common;

public class BHash {

  private int b1;
  private int b2;

  public BHash(int b1, int b2) {
    this.b1 = b1;
    this.b2 = b2;
  }

  public int getB1() {
    return b1;
  }

  public void setB1(int b1) {
    this.b1 = b1;
  }

  public int getB2() {
    return b2;
  }

  public void setB2(int b2) {
    this.b2 = b2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BHash bHash = (BHash) o;
    return b1 == bHash.b1 && b2 == bHash.b2;
  }

  @Override
  public int hashCode() {
    return b1 * b2;
  }
}
