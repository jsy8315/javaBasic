package com.javaApplication05;

import java.util.function.IntBinaryOperator;

interface MyFunction {
		public abstract int call(int x, int y);
	}

public class Practice04 {
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		MyFunction addFunction = (int a, int b) -> {return a + b;};
		
		int result = addFunction.call(5,4);
		System.out.println("5 + 4 = " + result);
		
	}
}
