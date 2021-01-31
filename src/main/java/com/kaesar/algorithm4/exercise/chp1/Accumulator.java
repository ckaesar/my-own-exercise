package com.kaesar.algorithm4.exercise.chp1;

public class Accumulator {
  private double total;
  private int N;

  public void addDateValue(double val) {
    N++;
    total += val;
  }

  public double mean() {
    return total / N;
  }

  @Override
  public String toString() {
    return "Mean (" + N + " value): " + String.format("%7.5f", mean());
  }
}
