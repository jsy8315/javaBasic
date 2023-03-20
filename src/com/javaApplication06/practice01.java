package com.javaApplication06;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class practice01 {
	public static void main(String[] args) throws IOException {
	String msg = "Hello World";
	Reader reader =  new StringReader(msg);
	// 앞에 있는 Reader는 더 상위, 추상적인 것, 추상클래스임
	char ch1 = (char) reader.read();
			
	}
	public static void fileWriteCode() throws IOException {
		FileWriter fw = new FileWriter("data.txt", true);
		fw.write("Hello.Wordl");
		fw.flush(); // 파일 쓰기
		fw.close(); // 파일 닫기
	}
}
