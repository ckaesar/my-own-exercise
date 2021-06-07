package com.kaesar.thread.ShiZhanJavaGaoBingFaSheJi2.chp2;

import lombok.Data;

/**
 * 测试用 stop() 方法强制终止终止线程。 会强行终止线程，导致出现不一致状态
 *
 * @Author: chengk
 * @Date: 2021/6/4 1:19 下午
 */
public class StopThreadUnsafe {
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
        @Override
        public void run() {
            while (true) {
                synchronized (user) {
                    int v = (int) (System.currentTimeMillis() / 1000);
                    user.setId(v);
                    // do something.
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    user.setName(String.valueOf(v));
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
        new ReadObjectThread().start();
        while (true) {
            Thread thread = new ChangeObjectThread();
            thread.start();
            Thread.sleep(150);
            thread.stop();
        }
    }
}
