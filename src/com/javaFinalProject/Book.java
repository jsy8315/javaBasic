package com.javaFinalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 책 정보 입력
// 책의 기본 정보
// 제목, 저자, 출판사, 키워드
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String possible; //대출 가능 불가능을 1, 0으로 표시

    Book() {}
    
    public Book(String title, String author, String publisher, String isbn, String possible) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.possible = possible;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", 출판사: " + publisher +
                ", ISBN: " + isbn;
    }
    
    //메소드 구현하기
    // 대출가능한 책 보여주기 (현재 가지고 있는 책)
    // 대출 불가능한 책 보여주기 (현재 없는 책, 반납 기간이 임박한 순서대로 정렬하기)
    // 전체 책을 출간된 순서대로 보여주기
    
    // 대출가능한 책 보여주기 (현재 가지고 있는 책)
	public void showingPossibleBook() {
		System.out.println("대출 가능한 책을 표시합니다.");
    	boolean shouldContinue131 = true; 
    	while (shouldContinue131) { // 메인 while문 다음 세번째 while문 중 첫번째 whille문
		
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\JungSuyoung\\Documents\\GitHub\\javaBasic\\finalproject\\books.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // "," 기준으로 분리하고, data array로 저장
                    if (data[5].equals("1")) {
                    	System.out.println("책제목 : " + data[0] + " 저자 : " +data[1] + " 출판사 : " + data[2]);
                    };
                }
            System.out.println("이전 화면으로 돌아갑니다.");
            shouldContinue131 = false; // 수정: shouldContinue 변수를 true로 변경
            break; // 두번째 while문 탈출

        } catch (IOException e) {
            System.err.println("파일 오류" + e.getMessage());
        } 
        
    	}
	}
	
    // 대출불가능한 책 보여주기 (현재 없는 책, 반납 기간이 임박한 순서대로 정렬하기)
	public void showingImpossibleBook() {
		
	}
	
    // 전체 책을 출간된 순서대로 보여주기
	public void showingLindedBook() {
		
	}

}
