package com.kaesar.designpattern.zen;

public class UserInfoTest {
  public static void main(String[] args) {
    IUserInfo userInfo = new UserInfo();
    // 我要赋值了，我就认为它是一个纯粹的BO
    IUserBO userBO = userInfo;
    userBO.setPassword("abc");
    // 我要执行动作了，我就认为是一个业务逻辑类
    IUserBiz userBiz = userInfo;
    userBiz.deleteUser();
  }
}
