package com.java12homework;

public class Book extends TangilbleAsset implements Thing {
    private String isbn;
    public String getIsbn() {
        return isbn;
    }
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
        }
        // TODO Auto-generated constructor stub
    
    }

