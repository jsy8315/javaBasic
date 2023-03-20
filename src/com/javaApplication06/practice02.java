package com.javaApplication06;
import java.io.FileWriter;
import java.io.IOException;

public class practice02 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("data.txt", true);
		fw.write("Hello.Wordl");
		fw.flush(); // 파일 쓰기
		fw.close(); // 파일 닫기
	}
}