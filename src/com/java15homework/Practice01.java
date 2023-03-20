package com.java15homework;

public class Practice01 {
	public static void printLength(String s) {
		int lengthOfS = s.length();
		System.out.println("문자 수: " + lengthOfS);
	}
	public static void main(String[] args) {
		printLength("라면잉건가"); // 비교하기 위한 test
		printLength(null);
	}
}
