package com.kaesar.design_patterns.zen;

public class Client5_10 {
  public static void main(String[] args) {
    InstallSoftware invoker = new InstallSoftware();
    invoker.installWizard(new Wizard());
  }
}
