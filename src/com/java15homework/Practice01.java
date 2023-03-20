package com.java15homework;

public class Practice01 {
	public static void printLength(String s) {
		try {
		int lengthOfS = s.length();
		System.out.println("문자 수: " + lengthOfS);
	} catch(NullPointerException e) {
		System.out.println("NullPointerException 예외를 catch 하였습니다");
		//"NullPointerException 예외를 catch 하였습니다"를 표시한다
		System.out.println("----stack trace(여기부터)----");
		// ----stack trace(여기부터)----를 표시한다
		e.printStackTrace();
		// stack trace를 표시한다
		System.out.println("----stack trace(여기까지)----");
	}
	}
	public static void main(String[] args) {
		printLength("라면잉건가"); // 비교하기 위한 test
		printLength(null);
	}
}
