package com.java09;

public abstract class Character {
    private String name;
    private int hp;
    
    public Character(String name) {
        this.name = name;
    }
    
    public abstract void attack(Kinoko kinoko);
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void run() {
        System.out.println("돔황챠");
    }
}
