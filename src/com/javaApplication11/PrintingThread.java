package com.javaApplication11;
import java.util.Scanner;

public class PrintingThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}


//public class  PrintingThread2 implement new Runnable() {
//	public void run() {
		
//	}
