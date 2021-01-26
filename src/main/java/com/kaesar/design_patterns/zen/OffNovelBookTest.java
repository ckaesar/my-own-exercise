package com.kaesar.design_patterns.zen;

import org.junit.Test;

public class OffNovelBookTest {
  private IBook below40NovelBook = new OffNovelBook("平凡的世界", 3000, "路遥");
  private IBook above40NovelBook = new OffNovelBook("平凡的世界", 6000, "路遥");

  // 测试低于40元的数据是否是打八折
  @Test
  public void testGetPriceBelow40() {
    assert 2400 == this.below40NovelBook.getPrice();
  }

  // 测试大于40元的书籍是否是打九折
  @Test
  public void testGetPriceAbove40() {
    assert 5400 == this.above40NovelBook.getPrice();
  }
}
