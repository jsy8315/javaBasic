package com.javaFinalProject;
// 책 정보 입력
// 책의 기본 정보
// 제목, 저자, 출판사, 키워드
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;

    Book() {}
    
    public Book(String title, String author, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
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
		
	}
	
    // 대출불가능한 책 보여주기 (현재 없는 책, 반납 기간이 임박한 순서대로 정렬하기)
	public void showingImpossibleBook() {
		
	}
	
    // 전체 책을 출간된 순서대로 보여주기
	public void showingLindedBook() {
		
	}

}
