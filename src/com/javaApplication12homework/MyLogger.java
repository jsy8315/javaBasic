package com.javaApplication12homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
	private static MyLogger logger; //로거 인스턴스를 얻기
	private FileWriter fileWriter;
	
	private MyLogger() {
		try {
			File dummylog = new File("C:\\Users\\DA\\dummylog.txt");
			dummylog.createNewFile();
			fileWriter = new FileWriter(dummylog, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static MyLogger getInstance() {
        if (logger == null) {
            logger = new MyLogger();
        }
        return logger;
	}
	
	public void log(String message) {
		try {
			fileWriter.write(message + "\n");
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
