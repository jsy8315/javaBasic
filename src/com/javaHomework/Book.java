package com.javaHomework;
import java.util.Date;

public class Book {
    private String title; // 제목
    private Date publishDate; // 출간일
    private String comment; // 코멘트
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
