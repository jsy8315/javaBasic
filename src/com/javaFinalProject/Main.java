package com.javaFinalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// 회원 가입, 삭제는나중에 하자
// 일단 회원 관리부터 시작
public class Main {
	public static void main(String[] args) {
		// 먼저 대출 프로그램을 시작하고, 메뉴를 제공하자
		Scanner sc = new Scanner(System.in);
		System.out.println("도서 대출 프로그램을 시작합니다");
		System.out.println("1.대출시작    2.회원관리    3.도서관리    4.도연시   5.종료");
		int startInput = sc.nextInt();
		
		switch (startInput) {
			case 1:
				System.out.println("대출을 시작합니다.");
				break;
				
			case 2:
				System.out.println("회원관리를 시작합니다.");
				System.out.println("1.회원확인    2.회원가입    3.회원삭제    4.회원삭제취소   5.이전화면으로");
				int inputMemberMenu = sc.nextInt();
				switch (inputMemberMenu) {
					case 1:
						System.out.println("회원확인을 시작합니다.");
						break;
						
					case 2:
						System.out.println("회원가입을 시작합니다.");
						break;
						
					case 3:
						System.out.println("회원삭제를 시작합니다.");
						break;
						
					case 4:
						System.out.println("회원삭제 취소를 시작합니다.");
						break;
						
					case 5:
						System.out.println("이전화면으로 돌아갑니다.");
				}
			
				break;
				
			case 3:
				System.out.println("도서관리를 시작합니다.");
				break;
			
			case 4: 
				System.out.println("도연시를 시작합니다.");
				break;
			
			case 5:
				System.out.println("종료합니다.");
				break;
		}
    }
}
