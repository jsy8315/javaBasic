package com.javaApplication10;

public class Account {
	public static void main(String[] args) {
		System.out.println("===테스트 시작===");
		Account account = new Account ("홍길동", 30000);
		System.out.println(account);
		
		Account account2 = new Account ("한석봉", 0);
		account.transfer(account2, Integer.MAX_VALUE + 1);
		
		if (account2.getBalance() == (long) 2147483648L) {
			System.out.println("getBalance() 값 다름" + account2.getBalance());
		}
		
		System.out.println("===테스트 끝===");
	}
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
