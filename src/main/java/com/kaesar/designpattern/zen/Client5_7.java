package com.kaesar.designpattern.zen;

import java.util.ArrayList;
import java.util.List;

public class Client5_7 {
  public static void main(String[] args) {
    // 产生一个女生群体
    List<Girl> listGirls = new ArrayList<>();
    // 初始化女生
    for (int i = 0; i < 20; i++) {
      listGirls.add(new Girl());
    }
    Teacher teacher = new Teacher();
    teacher.command(new GroupLeader(listGirls));
  }
}
