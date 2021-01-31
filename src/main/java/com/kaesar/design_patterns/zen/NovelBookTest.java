package com.kaesar.design_patterns.zen;

import com.kaesar.algorithm4.exercise.chp1.TestCase;
import org.junit.Test;

public class NovelBookTest extends TestCase {
  private String name = "平凡的世界";
  private int price = 6000;
  private String author = "路遥";
  private IBook novelBook = new NovelBook(name, price, author);

  // 测试getPrice方法
  @Test
  public void testGetPrice() {
    // 原价销售，根据输入和输出的值是否相等进行断言
    assert this.price == this.novelBook.getPrice();
  }
}
