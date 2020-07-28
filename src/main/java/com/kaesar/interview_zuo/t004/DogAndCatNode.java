package com.kaesar.interview_zuo.t004;

/**
 * 自己的
 */
public class DogAndCatNode {
  private Pet first;
  private DogAndCatNode next;

  public DogAndCatNode(Pet pet) {
    this.first = pet;
  }

  public Pet getFirst() {
    return first;
  }

  public void setFirst(Pet first) {
    this.first = first;
  }

  public DogAndCatNode getNext() {
    return next;
  }

  public void setNext(DogAndCatNode next) {
    this.next = next;
  }
}
