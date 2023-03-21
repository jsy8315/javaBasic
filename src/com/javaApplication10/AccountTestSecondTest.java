package com.javaApplication10;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTestSecondTest { // 관례에 따라 테스트클래스명 + Test 끝나는 이름

	@Test
	public void test() {
		Account account2 = new Account("한석봉", 0);
		account.transfer(account2, Integer.MAX_VALUE + 1); //자바에서 MAX+VALUE 정수의 최대값은 2147483647
		
		if (account2.getBalance() == (long) 2147483647L) {
			System.out.println("getBalance() 값 다름" + account2.getBalance());
		}
		fail("Not yet implemented");
	}

}
