package com.kaesar.java_common;

public class UserCopy {

  public static void main(String[] args) {
    Address address = new Address("杭州", "中国");
    User user = new User("大山", address);

    User copy = constructorCopy(user);
    user.getAddress().setCity("深圳");

    new Object();

    System.out.println(user.getAddress().getCity().equals(copy.getAddress().getCity()));
  }

  public static User constructorCopy(User user) {
    // 调用构造函数时进行深拷贝
    return new User(user.getName(), new Address(user.getAddress().getCity(), user.getAddress().getCountry()));
  }
}
