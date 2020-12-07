package com.kaesar.test;


import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();
    HashMap<String, String> hashMap = new HashMap<>();
    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    Object obj = new Object();
    SoftReference<Object> sf = new SoftReference<>(obj);
    WeakReference<Object> wf = new WeakReference<>(obj);

  }
}