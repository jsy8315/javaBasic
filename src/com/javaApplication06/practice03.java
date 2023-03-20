package com.javaApplication06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;


public class practice03 {
	public static void main(String[] args) throws IOException {
	String msg = "Hello World";
	Reader reader =  new StringReader(msg);
	// 앞에 있는 Reader는 더 상위, 추상적인 것, 추상클래스임
	char ch1 = (char) reader.read(); // H
	System.out.println(ch1);
	}
}
