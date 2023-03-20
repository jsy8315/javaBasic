package com.java15homework;
import java.io.IOException;
// 기동 직후에 "프로그램 시작"을 표시하고
// IOException을 임의로 발생시켜 이상 종료되도록 프로그램을 작성하시오
public class Practice04 {
	public static void main(String[] args) {
		try {String haland = new String("폼란드 홀 미쳤다");
			System.out.println("프로그램 시작");
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
