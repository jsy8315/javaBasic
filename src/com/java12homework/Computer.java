package com.java12homework;

public class Computer extends TangilbleAsset implements Thing {
    private String makerName;
    public String getMakerName() {
        return makerName;
    }
    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
        // TODO Auto-generated constructor stub
    }

}
