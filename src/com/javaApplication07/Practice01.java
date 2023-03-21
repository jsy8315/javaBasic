package com.javaApplication07;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Practice01 {
	public static void main(String[] args) {
		Reader fr = new FileReader("data.properties");
		Properties prop = new Properties();
		prop.load(fr);
		String name = prop.getProperty("heroName");
		String hp = prop.getProperty("heroHp");
		System.out.println("용사의 이름 : " + name);
		System.out.println("용사의 HP : " + hp);
		fr.close();
	}
	
}
