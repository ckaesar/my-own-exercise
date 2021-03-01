package com.kaesar.designpattern.zen;

public abstract class AbstractSearcher {
  protected IPrettyGirl prettyGirl;

  public AbstractSearcher(IPrettyGirl _prettyGirl) {
    this.prettyGirl = _prettyGirl;
  }

  // 搜索美女，列出美女信息
  public abstract void show();
}
