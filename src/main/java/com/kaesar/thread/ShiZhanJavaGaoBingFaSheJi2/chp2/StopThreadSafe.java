package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

import lombok.Data;

/**
 * 手动停止线程
 *
 * @Author: chengk
 * @Date: 2021/6/4 1:19 下午
 */
public class StopThreadSafe {
    public static User user = new User();

    @Data
    public static class User {
        private int id = 0;
        private String name = "0";

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static class ChangeObjectThread extends Thread {
        volatile static boolean stopMe = false;

        @Override
        public void run() {
            while (true) {
                if (stopMe) {
                    System.out.println("exit by stop me.");
                    break;
                }

                synchronized (user) {
                    int v = (int) (System.currentTimeMillis() / 1000);
                    user.setId(v);
                    // do something.
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    user.setName(String.valueOf(v));
                    System.out.println(user);
                }
                Thread.yield();
            }
        }
    }

    public static class ReadObjectThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (user) {
                    if (user.getId() != Integer.parseInt(user.getName())) {
                        System.out.println(user.toString());
                    }
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ChangeObjectThread().start();
        Thread.sleep(100);
        ChangeObjectThread.stopMe = true;
    }
}
