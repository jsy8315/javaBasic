package com.java15;
import java.io.FileWriter;
import java.io.IOException;
	
	public class practice01 {
	
		public static void main(String[] args) {
			try (FileWriter fw = new FileWriter("data.txt")) {
				fw.write("heelo");
			} catch (IOException e) {
				System.out.println("뭐가 에러 발생");
			}
		}
	}
		
