package com.javaFinalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 회원 정보 입력
// 가입한 날짜, 이름, 주소, 연락처, 생일 등을 저장
public class Member {
	Scanner sc = new Scanner(System.in);
    private String name;
    private String address;
    private String phoneNumber;
    private String birthday;
    private String memberDay;
	private String nameAndPhoneNumber;

    public Member(String name, String address, String phoneNumber, String birthday, String memberDay, String nameAndPhoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday; // 정수값인데 string으로
        this.memberDay = memberDay; // 정수값인데 string으로
        this.nameAndPhoneNumber = name + phoneNumber; // 동명이인 방지를 위해 이름 + 전화번호를 저장
    } 

    @Override
    public String toString() {
        return "이름: " + name + ", 주소: " + address + ", 전화번호: " + phoneNumber +
                ", 생년월일: " + birthday + ", 가입일: " + memberDay;
    }
    
    // 1.회원확인 메소드
    public void memberIdentify() {
    	
		System.out.print("먼저, 회원 이름과 전화번호를 입력하세요 : "); //일단 이 사람이 회원인지 확인하기, 동명이인있을수 있으니까 전화번호까지 해서 
		String inputNameAndPhoneNumber = sc.next();
		
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DA\\finalproject\\member.csv"));
            String line;
            boolean isMemberFound = false;  // 일치하는 회원이 있는지 여부를 저장하는 변수
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // "," 기준으로 분리하고, Member타입의 변수 member로 저장
                Member member = new Member(data[0], data[1], data[2], data[3], data[4], data[5]);
                if (member.nameAndPhoneNumber().equals(inputNameAndPhoneNumber)) {
                    System.out.println("찾은 멤버 이름: " + member);
                    isMemberFound = true;  // 일치하는 회원이 있었음을 표시
                }
            }
            if (!isMemberFound) {  // 일치하는 회원이 없는 경우에만 문구 출력
                System.out.println("회원이 아닙니다. 회원가입 후 이용 가능합니다."); //
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("파일 오류" + e.getMessage());
        }
    }
    // 2.회원가입
    // 3.회원삭제
    // 4.회원삭제취소
    // 5. 이전화면으로??

}

	private Object nameAndPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}
