package com.javaApplication11;

import java.util.Scanner;

public class Threadmain {
	public static void main(String[] args) {
		System.out.println("키 입력");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thread : " + Thread.currentThread().getName());
		
		StringBuilder sb = new StringBuilder();
		
		
		new Thread(() ->  {
			for (int i = 0; i < 3; i++) {
				try {Thread.sleep(50);
			System.out.println("Thread : " + Thread.currentThread().getName());
			sb.append(i)
			}} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
		
		new Thread(() ->  {
			for (int i = 0; i < 3; i++) {
				try {Thread.sleep(50);
			System.out.println("Thread : " + Thread.currentThread().getName());
			}} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		scanner.nextLine();
		
	}
}
