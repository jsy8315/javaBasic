package com.javaApplication10;

public class AccountTest {
	public static void main(String[] args) {
		testInit();
	}
	public static void testInit() {
		System.out.println("===이용자1 테스트 시작===");
		Account account = new Account("정수영", 30000);
		if (!account.equals("정수영")) {
			System.out.println("이름이 다름");
		}
		if (30000 != account.getBalance()) {
			System.out.println("잔액이 다름");
		}
		System.out.println("===이용자1 테스트 끝, 이용자2 테스트 시작===");		
		Account account2 = new Account("한석봉", 0);
		account2.transfer(account2, Integer.MAX_VALUE + 1); //자바에서 MAX+VALUE 정수의 최대값은 2147483647
		
		if (account2.getBalance() == (long) 2147483647L) {
			System.out.println("getBalance() 값 다름" + account2.getBalance());
		}
		
		System.out.println("===테스트 전체 종료===");
	}
}
