package com.javaFinalProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Member {
	private String name;
	private String address;
	private String phonenumber;
	private String birthday;
	private String memberday;
	
	Member() {}
	
	Member(String name, String address, String phonenumber, String birthday, String memberday) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
		this.memberday = memberday;
	}
		
	Scanner sc = new Scanner(System.in);
    // 1.회원확인 메소드
    public void memberIdentify() { 
    	
    	boolean shouldContinue31 = true; 
    	while (shouldContinue31) { // 세번째 while문 중 첫번째 메소드
    	
		System.out.print("회원 이름을 입력하세요 :"); //일단 이 사람이 회원인지 확인하기, 동명이인있을수 있으니까 전화번호까지 해서 
		String inputName = sc.next(); // 이름 입력값 받기
		System.out.print("회원 스마트폰 번호를 \"-\" 없이 입력하세요 :");
		String inputPhonenumber = sc.next();
		
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DA\\finalproject\\member.csv"));
            String line;
            boolean isMemberFound = false;  // 일치하는 회원이 있는지 여부를 저장하는 변수
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // "," 기준으로 분리하고, Member타입의 변수 member로 저장
                if (data[0].equals(inputName) && data[2].equals(inputPhonenumber)) {
                    System.out.println("찾은 멤버 이름: " + data[0]);
                    isMemberFound = true;  // 일치하는 회원이 있었음을 표시
                    System.out.println("이전 화면으로 돌아갑니다."); // 이전 화면으로 돌아가기
                    shouldContinue31 = false; // 수정: shouldContinue 변수를 true로 변경
                    break; // 두번째 while문 탈출
                }
            }
            if (!isMemberFound) {  // 일치하는 회원이 없는 경우에만 문구 출력
                System.out.println("회원이 아닙니다. 회원가입 후 이용 가능합니다.");
                System.out.println("이전 화면으로 돌아갑니다."); // 이전 화면으로 돌아가기
                shouldContinue31 = false; // 수정: shouldContinue 변수를 true로 변경
                break; // 두번째 while문 탈출
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("파일 오류" + e.getMessage());
        }
    }
    }
    // 회원가입하는 메소드
    public void memberAdd() {
    	
    	boolean shouldContinue32 = true; 
    	while (shouldContinue32) { // 세번째 while문 중 두번째 메소드
    		System.out.print("회원의 이름을 입력하세요 :");
    		String inputName2 = sc.next(); // 
    		System.out.print("회원의 주소를 입력하세요 :");
    		String inputAddress = sc.next(); // 
    		System.out.print("회원 스마트폰 번호를 \"-\" 없이 입력하세요 :");
    		String inputPhonenumber2 = sc.next();
    		System.out.print("회원의 생년월일을 1900/09/09 형식으로 입력하세요 :");
    		String inputBirthday = sc.next(); // 
    		System.out.print("회원가입하는 날짜를 1900/09/09 형식으로 입력하세요 :");
    		String inputMemberday = sc.next(); // 
    		
            // 새로운 회원 정보를 문자열로 생성
            String newMember = inputName2 + "," + inputAddress + "," + inputPhonenumber2 + "," + inputBirthday + "," + inputMemberday;
            
            try {
                // BufferedWriter를 사용하여 파일에 데이터를 추가함
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\DA\\finalproject\\member.csv", true)); // true는 append모드임을 나타냄
                writer.write("\n");
                writer.write(newMember); // 적어넣음
                writer.close();
                System.out.println("새로운 회원 정보가 추가되었습니다.");
                System.out.println("이전 화면으로 돌아갑니다."); // 이전 화면으로 돌아가기
                shouldContinue32 = false; // 수정: shouldContinue 변수를 true로 변경
                break; 
            } catch (IOException e) {
                System.out.println("파일 쓰기 오류가 발생하였습니다.");
                e.printStackTrace();
            }
        }
    	}
    	
}

