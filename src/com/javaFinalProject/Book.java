package com.javaFianlProject;
// 책 정보 입력
// 책의 기본 정보
// 제목, 저자, 출판사, 키워드
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;

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

}
