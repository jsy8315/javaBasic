package com.javaSelfstudy20230325;

// animal 인터페이스 구현하는 클래스 만들어보기

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog eats bones.");
	}

	@Override
	public void move() {
		System.out.println("Dog runs.");
	}
	public void bark() { // 인터페이스를 통하지 않고, 추가한 메서드
		System.out.println("Dog barks");
	}
	
}
