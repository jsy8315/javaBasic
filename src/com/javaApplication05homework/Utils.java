package com.javaApplication05homework;
import java.util.*;

interface Func1 {
	boolean func1IsOdd (int n);
}
interface Func2 {
	String func2AddNamePrefix (boolean male, String name);
}

public class Utils {
	public static boolean isOdd(int n) {
		return n % 2 == 1;
	}

	public static String addNamePrefix(boolean male, String name) {
		if (male == true) {
			return "Mr." + name;
		}
		return "Ms." + name;
	}
	
	public static void main(String[] args) {
		Func1 func1 = (int n) -> {return n % 2 == 1;};
		boolean result1 = func1.func1IsOdd(5);
		System.out.println("5 % 2 == 1 : " + result1);
		
		Func2 func2 = (boolean male, String name) -> { if (male == true) {return "Mr." + name;} return "Ms." + name;};	
		String result2 = func2.func2AddNamePrefix(true, "Suyoung");
		System.out.println(result2);
	}
}