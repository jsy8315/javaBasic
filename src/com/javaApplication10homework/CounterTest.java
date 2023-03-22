package com.javaApplication10homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CounterTest {

	@Test
	public void test() {
		Counter counter = new Counter();
		counter.setCount(3);
		counter.increment();
		assertEquals(4, counter.getCount());
	}
	
	@Test
	public void test2() {
		Counter counter = new Counter();
		counter.increment();
		assertEquals(7, counter.getCount());
	}
	

}
