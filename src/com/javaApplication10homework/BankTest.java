package com.javaApplication10homework;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void nameLengthOverTest() {
		Bank bank = new Bank();
		bank.setName("카카오뱅크");
		assertEquals("카카오뱅크", bank.getName());
	}
	
	@Test
	public void errorMsgTest() {
		try {
			Bank bank = new Bank();
			bank.setName("하나");
		} catch (IllegalArgumentException e) {
			assertEquals("이름이 잘못 되었음", e.getMessage());
		}
		
	}

}
