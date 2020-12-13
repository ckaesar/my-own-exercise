package com.kaesar.thread;

public class ThreadLocalExample2 {
  public static class MyRunnable implements Runnable {
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
      threadLocal.set((int) (Math.random() * 100D));
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(threadLocal.get());
    }
  }

  public static void main(String[] args) throws InterruptedException {
    MyRunnable sharedRunnableInstance = new MyRunnable();

    Thread thread1 = new Thread(sharedRunnableInstance);
    Thread thread2 = new Thread(sharedRunnableInstance);

    thread1.start();
    thread2.start();

    thread1.join(); // wait for thread1 to terminate
    thread2.join(); // wait for thread1 to terminate
  }
}
