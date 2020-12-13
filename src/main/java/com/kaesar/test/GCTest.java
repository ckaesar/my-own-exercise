package com.kaesar.test;

/**
 * 分配担保机制
 * 在JVM的内存分配时，也有这样的内存分配担保机制。就是当在新生代无法分配内存的时候，把新生代的对象转移到老生代，然后把新对象放入腾空的新生代。
 */
public class GCTest {

  /**
   * JVM: -XX:+PrintGCDetails
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    byte[] allocation1, allocation2, allocation3/*, allocation4, allocation5, allocation6 */;
    allocation1 = new byte[112000 * 1024];
    allocation2 = new byte[1800 * 1024];
    allocation3 = new byte[2000 * 1024];
//    allocation4 = new byte[2000 * 1024];
//    allocation5 = new byte[2000 * 1024];
//    allocation6 = new byte[2000 * 1024];


//    Thread.sleep(Integer.MAX_VALUE);
  }
}
