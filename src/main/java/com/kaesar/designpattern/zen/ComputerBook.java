package com.kaesar.designpattern.zen;

public class ComputerBook implements IComputerBook {
  private String name;
  private String scope;
  private String author;
  private int price;

  public ComputerBook(String _name, int _price, String _author, String _scope) {
    this.name = _name;
    this.price = _price;
    this.author = _author;
    this.scope = _scope;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getScope() {
    return scope;
  }

  @Override
  public String getAuthor() {
    return author;
  }

  @Override
  public int getPrice() {
    return price;
  }
}
