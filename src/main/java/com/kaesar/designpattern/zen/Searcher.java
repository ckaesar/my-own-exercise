package com.kaesar.designpattern.zen;

public class Searcher extends AbstractSearcher {
  public Searcher(IPrettyGirl _prettyGirl) {
    super(_prettyGirl);
  }

  // 展示美女的信息
  public void show() {
    System.out.println("-----美女的信息如下：");
    // 展示面容
    super.prettyGirl.goodLooking();
    // 展示身材
    super.prettyGirl.niceFigure();
    // 展示气质
    super.prettyGirl.greatTemperament();
  }
}
