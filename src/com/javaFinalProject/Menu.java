package com.javaFinalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Menu {
	Scanner sc = new Scanner(System.in);
	
	// 첫번째 화면의 메뉴
	int layer1Menu() { 
		System.out.println("도서 대출 프로그램을 시작합니다");
		System.out.println("1.대출시작    2.회원관리    3.도서관리    4.도연시   5.종료");
		int layer1MenuInput = sc.nextInt();
		return layer1MenuInput;
	}
	int layer2SecondMenu() { // 두번째 레이어(메뉴)에서, 2.회원관리 다음의 메뉴
		System.out.println("회원관리를 시작합니다.");
		System.out.println("1.회원확인    2.회원가입    3.회원삭제    4.직전회원삭제취소   5.이전화면");
		int layer2SecondMenu = sc.nextInt();
		return layer2SecondMenu;
	}
}
