package com.javaFianlProject;
// 책 정보 입력
// 책의 기본 정보
// 제목, 저자, 출판사, 키워드
public class Book {
	String title;
	String author;
	String publisher;
	int isbn;// 12자리 정수로 설정 -> 편의상 6글자로 하자
	
	Book(String title) {
		this.title = title;
	}
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	Book(String title, String author, String publisher, int isbn) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	
	//기능
	// 책 제목, 저자, 출판사, isbn 등을 입력하면 맞는 후보 들을 보여주면 좋겠음
	// 그리고 맞는 책을 선택하면 대출 가능, 대출 불가가 뜨며, 남은 대출기간도 표시되면 좋겠음
}
