package com.kaesar.jvm_zzm.chp2;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆内存溢出异常测试
 * 说明：Java堆用于存储对象实例，只要不断地创建对象，并且保证GC Roots到对象之间有可达路径来避免
 * 垃圾回收机制清楚这些对象，那么随着对象数量的增加，总容量触及最大堆的容量限制后就会产生内存溢出异常。
 *
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
  static class OOMObject {

  }

  public static void main(String[] args) {
    List<OOMObject> list = new ArrayList<OOMObject>();
    while (true) {
      list.add(new OOMObject());
    }
  }
}
