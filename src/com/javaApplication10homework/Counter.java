package com.javaApplication10homework;

public class Counter {
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void count() {
		count++;
	}
}

class DownCounter {
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void count() {
		count--;
	}
}