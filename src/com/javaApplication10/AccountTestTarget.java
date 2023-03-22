package com.javaApplication10;

public class AccountTestTarget {
	public static void main(String[] args) {
		System.out.println("===테스트 시작===");
		
		Account account = new Account("정수영", 30000);
		Account account2= new Account("홀란드", 10000);
		
		account.transfer(account2, 10000);
		
		System.out.println("정수영이 홀란드에게 용돈 10000원을 송금");
		System.out.println(account);
		System.out.println(account2);
		System.out.println("===테스트 종료===");
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
		
		public AccountTestTarget(String owner, int balance) {
			this.owner = owner;
			this.balance = balance;
		}
		public void transfer(Account dest, int amount) {
			dest.setBalance(dest.getBalance() + amount);
			balance -= amount;
		}
		@Override
		public String toString() {
			return "Account [owner = " + owner + ", balance = " + balance + "]";
		}
}
