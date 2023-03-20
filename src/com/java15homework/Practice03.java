package com.java15homework;

public class Practice03 {
	public static void main(String[] args) {
		String string1 = "Three";
		try {
			int i = Integer.parseInt(string1);
			System.out.println("예외 발생하지 않음");
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("예외가 발생함");
			e.printStackTrace();
		}
	}
}
