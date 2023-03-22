package com.javaApplication11;

public class Counter {
    int num = 0;

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                    counter.num += 1;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.sleep(3000);
        System.out.println(counter.num);

    }

}