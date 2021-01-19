package com.kaesar.java_common;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

public class StudyGuavaCache {
  public static void main(String[] args) throws InterruptedException {
    Cache<String, Object> cache = CacheBuilder.newBuilder()
                                              .maximumSize(100)
                                              .expireAfterWrite(3000, TimeUnit.MILLISECONDS)
                                              .weakValues()
                                              .build();
    cache.put("word", "Hello Guava Cache");
    System.out.println(cache.getIfPresent("word"));
    Thread.sleep(2000);
    System.out.println(cache.getIfPresent("word"));
    Thread.sleep(2000);
    System.out.println(cache.getIfPresent("word"));

    Object value = new Object();
    cache.put("key2", value);
    System.out.println(cache.getIfPresent("key2"));
    value = new Object();
    System.gc();
    System.out.println(cache.getIfPresent("key2"));
  }
}
