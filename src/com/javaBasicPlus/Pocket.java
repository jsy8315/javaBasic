package com.javaBasicPlus;

public class Pocket<T> {
    public static void main(String[] args) {
        Pocket<String> pocket = new Pocket<String>();
        pocket.setData(null);
    }
    private T data;
    
    public Pocket(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

