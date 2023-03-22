package com.javaApplication12;

public interface OnClickEvent {
	public static void main(String[] args) throws InterruptedException {
		Button addButton = 
	void onClick();
}

class Button {
	}
	
	void click(OnClickEvent listener) {
		this.listener = listener;
	}
	
	void click() {
		listener.onClick();
	}
}
