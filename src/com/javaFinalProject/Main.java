package com.javaFinalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// 회원 가입, 삭제는나중에 하자
// 일단 회원 관리부터 시작
public class Main {
	public static void main(String[] args) {
		// 입력한 이름이 회원이 맞는지 부터 시작
		Scanner sc = new Scanner(System.in);
		System.out.println("도서 대출을 시작합니다");
		System.out.print("먼저, 회원의 이름을 입력하세요 : ");
		String inputName = sc.next();
		sc.close();
		
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DA\\finalproject\\member.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Member member = new Member(data[0], data[1], data[2], data[3], data[4]);
                if (member.getName().equals(inputName)) {
                    System.out.println("찾은 멤버 정보: " + member);
                }
            }

            reader.close();

        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 에러가 발생했습니다: " + e.getMessage());
        }
    }
		
		
		
	}
