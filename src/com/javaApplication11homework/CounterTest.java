package com.javaApplication11homework;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.add(10);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.mul(2);
            }
        });

        thread1.start(); // start()메소드는 새로운 스레드를 생성하고, 해당 스레드의 run()메소드를 실행함
        thread2.start();

        try {
            thread1.join(); // thread1 스레드의 작업이 끝날때까지 대기하도록 하는 메소드
            thread2.join(); // thread2 스레드의 작업이 끝날때까지 대기하도록 하는 메소드 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count: " + counter.getCount()); // thread1,2메소드가 각각의 스레드 작업을 완료한 후에, 호출
    }
}

