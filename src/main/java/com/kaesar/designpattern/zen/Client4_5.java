package com.kaesar.designpattern.zen;

public class Client4_5 {
  public static void main(String[] args) {
    // 定义一个美女
    IPrettyGirl xianXian = new PrettyGirl("仙仙");
    AbstractSearcher searcher = new Searcher(xianXian);
    searcher.show();
  }
}
