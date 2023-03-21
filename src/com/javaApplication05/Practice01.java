package com.javaApplication05;

import java.util.function.IntBinaryOperator;

public class Practice01 {
	
	interface Myfunction {
		int call(int x, int y);
	}
	
	public static int deohagi(int x, int y) {
		return x + y;
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		IntBinaryOperator.addFunction =  Practice01::add;
		Myfunction addFunction=  Practice01::add;
		Myfunction addFunction2 = ( int a, int b) -> {
			return a + b;
		}
		
		int result = addFunction.applyAsInt(5,4);
		System.out.println("5 + 3 = " + result);
		
	}
}
