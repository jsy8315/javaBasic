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
		
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DA\\finalproject\\member.csv"));
            String line;
            boolean isMemberFound = false;  // 일치하는 회원이 있는지 여부를 저장하는 변수
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Member member = new Member(data[0], data[1], data[2], data[3], data[4]);
                if (member.getName().equals(inputName)) {
                    System.out.println("찾은 멤버 이름: " + member);
                    isMemberFound = true;  // 일치하는 회원이 있었음을 표시
                    break;  // 회원을 찾았으므로 검색 중지
                }
            }
            if (!isMemberFound) {  // 일치하는 회원이 없는 경우에만 문구 출력
                System.out.println("회원이 아닙니다. 회원가입 후 이용 가능합니다.");
            }

            reader.close();

        } catch (IOException e) {
            System.err.println("파일 오류" + e.getMessage());
        }
        
        System.out.println("축하합니다!책을 단 한권도 빌리지 않았던 순수한 회원입니다.");
        System.out.print("빌리고 싶은 책의 제목을 입력하세요 : ");
		String inputTitle = sc.next();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DA\\finalproject\\books.csv"));
            String line;
            boolean isBookFound = false;  // 일치하는 회원이 있는지 여부를 저장하는 변수
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Book book = new Book(data[0], data[1], data[2], data[3]);
                if (book.getTitle().equals(inputTitle)) {
                    System.out.println("찾은 책 제목: " + book);
                    isBookFound = true;  // 일치하는 회원이 있었음을 표시
                    break;  // 회원을 찾았으므로 검색 중지
                }
            }
            if (!isBookFound) {  // 일치하는 회원이 없는 경우에만 문구 출력
                System.out.println("책 제목이 틀렸거나 없는 책입니다.");
            }

            reader.close();
    		sc.close();
        } catch (IOException e) {
            System.err.println("파일 오류" + e.getMessage());
        }
        
    }
}
