package com.kaesar.design_patterns.zen;

public class NovelBook implements IBook {
  // 书籍名称
  private String name;
  // 书籍价格
  private int price;
  // 书籍作者
  private String author;

  public NovelBook(String _name, int _price, String _author) {
    this.name = _name;
    this.price = _price;
    this.author = _author;
  }

  // 书籍叫什么名字
  public String getName() {
    return this.name;
  }

  // 书籍的价格
  public int getPrice() {
    return this.price;
  }

  // 书籍的作者
  public String getAuthor() {
    return this.author;
  }
}
