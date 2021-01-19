package com.kaesar.design_patterns.zen;

public interface IUserBiz {
  boolean changePassword(String oldPassword);

  boolean deleteUser();

  void mapUser();

  boolean addOrg(int orgID);

  boolean addRole(int roleID);
}
