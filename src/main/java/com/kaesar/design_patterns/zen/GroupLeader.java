package com.kaesar.design_patterns.zen;

import java.util.List;

public class GroupLeader {
  private List<Girl> listGirls;
  // 传递全班的女生进来
  public GroupLeader(List<Girl> _listGirls) {
    this.listGirls = _listGirls;
  }

  // 清查女生数量
  public void countGirls() {
    System.out.println("女生数量是：" + this.listGirls.size());
  }
}