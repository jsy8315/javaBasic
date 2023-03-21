package com.javaApplication05;

import java.util.function.IntBinaryOperator;

public class Main {
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		IntBinaryOperator addFunction = Main::add;
		
		int result = addFunction.applyAsInt(5,4);
		System.out.println("5 + 4 = " + result);
		
	}
}
