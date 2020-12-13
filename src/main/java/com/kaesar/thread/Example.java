package com.kaesar.thread;

public class Example {
  public static void main(String[] args) {
    Countor countor = new Countor();
    CountorThread threadA = new CountorThread(countor);
    CountorThread threadB = new CountorThread(countor);

    threadA.start();
    threadB.start();

    Countor countorC = new Countor();
    Countor countorD = new Countor();
    CountorThread threadC = new CountorThread(countorC);
    CountorThread threadD = new CountorThread(countorD);

    threadC.start();
    threadD.start();
  }
}
