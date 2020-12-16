package com.kaesar.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorTest {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    executorService = Executors.newFixedThreadPool(10);
    executorService = Executors.newCachedThreadPool();
  }
}
