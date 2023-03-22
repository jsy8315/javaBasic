package com.javaApplication10;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTestTargetTest {

	@Test
	public void nametest() {
		Account account = new Account("정수영", 30000);
		assertEquals("정수영", account.getOwner());
		assertEquals(30000, account.getBalance());
	}
	
	@Test
	public void testName() {
		Account account = new Account("정수영", 30000);
		Account account2 = new Account("홀란드", 0);
		account.transfer(account2, 10000);
		assertEquals(10000, account2.getBalance());
		assertEquals(20000, account.getBalance());
		Account account3 = new Account("가짜",0);
		account3.transfer(account, 10000);
		assertEquals(0, account3.getBalance());
	}

}
