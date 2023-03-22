package com.javaApplication11homework;
// 0-50까지의 정수를 출력하는 CountUpThread 클래스를 작성하시오
// 작성한 CountUpThread 인스턴스 3개를 생성하고 실행하시오
public class CountUpThread {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("시작");
		
		new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				System.out.println("첫번째 스레드 : " + i);
			}
		}).start();
		
		new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				System.out.println("두번째 스레드 : " + i);
			}
		}).start();
		
		new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				System.out.println("세번째 스레드 : " + i);
			}
		}).start();
	}
	
}
