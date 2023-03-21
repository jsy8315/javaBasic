package com.javaApplication07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Practice71 {
	public static void main(String[] args) throws IOException {
		Reader gr = new FileReader("gradle.properties");
		Properties prop = new Properties();
		prop.load(gr);
		String name = prop.getProperty("android.useAndroidX");
		System.out.println("android.useAndroidX는 : " + name);
		gr.close();
	}
	
}

