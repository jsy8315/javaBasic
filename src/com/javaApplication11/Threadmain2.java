package com.javaApplication11;

import java.util.Scanner;

public class Threadmain2 {
	public static void main(String[] args) {
		System.out.println("키 입력");
		Scanner scanner = new Scanner(System.in);
		
		new PrintingThread().start();
		
		
	}
}
