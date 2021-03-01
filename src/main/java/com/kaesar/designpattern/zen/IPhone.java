package com.kaesar.designpattern.zen;

public interface IPhone {
  // 拨通电话
  void dial(String phoneNumber);

  // 通话
  void chat(Object o);

  // 通话完毕，挂电话
  void hangup();
}
