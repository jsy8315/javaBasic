package com.java12homework;

public abstract class TangilbleAsset extends Asset implements Thing{
    
    public TangilbleAsset(String name, int price, String color) {
        super(name, price);
        // TODO Auto-generated constructor stub
        this.color = color;
    }
    private String color;
    private double weight;
    
    public String getColor() {
        return color;
    }
    @Override
    public double getWeight() {
        // TODO Auto-generated method stub
        return weight;
    }
    @Override
    public void setWeight(double Weight) {
        // TODO Auto-generated method stub
        this.weight = weight;
    }
}
