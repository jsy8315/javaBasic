package com.javaApplication10;

public class Account {
	private String owner;
	private int balance;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public void transfer(Account dest, int amount) {
		dest.setBalance(dest.getBalance() + amount);
		balance -= amount;
	}
}
