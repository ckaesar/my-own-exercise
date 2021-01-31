package com.kaesar.algorithm4.exercise.chp1;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdRandom;

public class TestAccumulator {
  public static void main(String[] args) {
    String intStr = "180";
    int T = Integer.parseInt(intStr);
    Accumulator a = new Accumulator();
    for(int t = 0; t < T; t++) {
      a.addDateValue(StdRandom.random());
    }
    StdOut.println(a);
    assert 1 > 2 : "error";
  }
}
