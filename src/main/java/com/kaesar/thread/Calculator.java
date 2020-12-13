package com.kaesar.thread;

public class Calculator {
  private ImmutableValue currentValue = null;

  public ImmutableValue getValue() {
    return currentValue;
  }

  public void setValue(ImmutableValue newValue) {
    this.currentValue = newValue;
  }

  public void add(int newValue) {
    this.currentValue = this.currentValue.add(newValue);
  }
}
