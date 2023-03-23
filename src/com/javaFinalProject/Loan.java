package com.javaFinalProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loan {
	Scanner sc = new Scanner(System.in);
	
	// 구현해야할 메소드
	// 1. 책 대출 해주기 
	//		대출 이력 저장하기
	// 2. 책 반납 받기
	// 3. 반납 날짜 확인하기
	// 4. 반납 기한 연장해주기
	
	// 1. 책 대출 해주기 , 대출 이력 저장하기
	public void lendingBook() {
		System.out.print("회원 이름을 입력하세요 : "); //일단 이 사람이 회원인지 확인하기, 동명이인있을수 있으니까 전화번호까지 해서 
		String inputlendingBookName = sc.next(); // 이름 입력값 받기
		System.out.print("회원 스마트폰 번호를 \"-\" 없이 입력하세요 : ");
		String inputlendingBookPhonenumber = sc.next();
		
        ArrayList<String> lenderArrayList = new ArrayList<>();
        lenderArrayList.add(inputlendingBookName);
        lenderArrayList.add(inputlendingBookPhonenumber);
        //lenderArrayList에 이름, 번호 저장
        
		
    	boolean shouldContinue111 = true; 
    	while (shouldContinue111) { // 메인 while문 다음 첫번째 while문 중 첫번째 whille문
		
    		// 회원확인하는거 부터 넣기
    		
    		try {
                BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\JungSuyoung\\Documents\\GitHub\\javaBasic\\finalproject\\member.csv"));
                String line1;
                while ((line1 = reader1.readLine()) != null) {
                    String[] data = line1.split(","); // "," 기준으로 분리하고, data array로 저장
                        if (data[0].equals(inputlendingBookName) && data[2].equals(inputlendingBookPhonenumber)) {
                        	// 회원인지 확인
                        	System.out.println("회원입니다. 대출 가능한지 확인 중입니다.");
                        }else {
                        	// 회원 아님
                        	System.out.println("회원이 아닙니다. 회원가입부터 진행해주세요.");
                        	System.out.println("이전 화면으로 돌아갑니다.");
                            shouldContinue111 = false; 
                        }
                    }
                // 회원인거 확인했으니 대출 가능한지 확인
                BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\JungSuyoung\\Documents\\GitHub\\javaBasic\\finalproject\\member.csv"));
                String line2;
                while ((line2 = reader2.readLine()) != null) {
                	String[] data = line2.split(","); // "," 기준으로 분리하고, data array로 저장
                    	if (data[0].equals(inputlendingBookName) && data[2].equals(inputlendingBookPhonenumber) && data[5] == "1") {
                    	// 사람은 찾았는데 이미 빌린 책이 하나 있어서 못빌림
                    		System.out.println("대출 중인 도서가 있습니다. 기존 도서 반납 후 대출하세요.");
                    		System.out.println("이전 화면으로 돌아갑니다.");
                    		shouldContinue111 = false; // 수정: shouldContinue 변수를 true로 변경
                    		break;
                    	}else if (data[0].equals(inputlendingBookName) && data[2].equals(inputlendingBookPhonenumber)&& data[5] == "0") {
                    		// 대출 가능함
                    		System.out.println("대출 가능합니다.");
                    	}
                	}
            // 책 검색
                System.out.println("책 제목을 입력해주세요 : "); 
                String inputlendingBookTitle= sc.next();
                BufferedReader reader3 = new BufferedReader(new FileReader("C:\\Users\\JungSuyoung\\Documents\\GitHub\\javaBasic\\finalproject\\books.csv"));
                String line3;
                while ((line3 = reader3.readLine()) != null) {
                	String[] data = line3.split(","); // "," 기준으로 분리하고, data array로 저장
                    	if (data[0].equals(inputlendingBookTitle)) {
                    		// 책 제목으로 파일 만들기
                    		String lenderFileName = data[0] + ".csv"; // lenderFileName 이름을 data[0] + ".csv"로 설정
                    		File lenderFile = new File("C:\\Users\\JungSuyoung\\Documents\\GitHub\\javaBasic\\finalproject\\lenderFileName"); // 새로운 File 객체 생성
                    	}
                }
                //ArrayList로 파일 만들기
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\JungSuyoung\\Documents\\GitHub\\javaBasic\\finalproject\\member.csv"));
                	for (String newLine : lenderArrayList) {
                		writer.write(newLine);
                		writer.newLine();
                	}
                	writer.close(); // 파일 닫기
    		} catch (IOException e) {
                        System.err.println("파일 오류" + e.getMessage());
                    }
    		
    		//책 빌린 이용자 0->1로 수정
    		try {
                BufferedReader reader4 = new BufferedReader(new FileReader("C:\\Users\\JungSuyoung\\Documents\\GitHub\\javaBasic\\finalproject\\member.csv"));
                String line4;
                while ((line4 = reader4.readLine()) != null) {
                    String[] data = line4.split(","); // "," 기준으로 분리하고, data array로 저장
                        if (data[0].equals(inputlendingBookName)){
                        	// member파일의 lendBook을 0 -> 1로 수정
                        }
                    }
    		} catch (IOException e) {
    			System.err.println("파일 오류" + e.getMessage());
    		} 
    		
        	// 기존 books 1 -> 0으로 수정, 반납 날짜 적기
    		try {
                BufferedReader reader5 = new BufferedReader(new FileReader("C:\\Users\\JungSuyoung\\Documents\\GitHub\\javaBasic\\finalproject\\books.csv"));
                String line5;
                while ((line5 = reader5.readLine()) != null) {
                    String[] data = line5.split(","); // "," 기준으로 분리하고, data array로 저장
                        if (data[0].equals(inputlendingBookTitle)) {
                        	// books 파일의 possible을 1 -> 0으로 전환
                        }else {
                        }
                    }
                    	System.out.println("대출이 완료되었습니다. 반납일은 대출일로부터 2주 후인 " + "요일쓰면 좋겠음" + "입니다.");
                    	System.out.println("이전 화면으로 돌아갑니다.");
                        shouldContinue111 = false; // 수정: shouldContinue 변수를 true로 변경
                        break;
    		} catch (IOException e) {
    			System.err.println("파일 오류" + e.getMessage());
    		} 
    	}
        
	}
	
	// 2. 책 반납 받기
	public void processingReturn() {
		
	}
	
	// 3. 반납 날짜 확인하기
	public void checkingReturnDay() {
		
	}
	
	// 4. 반납 기한 연장하기
	public void extensionDeadline() {
		
	}
}
