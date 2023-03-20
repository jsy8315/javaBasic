package com.javaApplication06homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.zip.GZIPOutputStream;

import javax.imageio.stream.FileCacheImageOutputStream;
// FileInputStream, FileOutputStream 클래스를 사용하여 파일을 복사하는 프로그램을 작성하시오. 
// 원본 파일 경로와 복사할 파일경로는 프로그램 실행 시 파라미터로 전달되는 것으로 하고, 
//버퍼링은 하지 않으나 예외 처리는 하시오.

public class Practice61 {
	public static void main(String[] args) throws IOException {
		try { 
			File file = new File("C:\\Users\\정수영\\Documents\\newtext.txt");
			// 원본파일
			File newFile = new File("C:\\Users\\정수영\\Documents\\newnewtext.txt");
			// 복사할 파일
			FileInputStream filePath = new FileInputStream(file);
			// File object를 생성자 인수로 받기
			GZIPOutputStream newFilePath = new GZIPOutputStream(new FileOutputStream(newFile));
			// 복사된 파일 위치
			
			byte[] b = new byte[1024];
			// 사이즈 지정(한번에 read, write할)
			int data;
			while ((data = filePath.read(b)) > 0) {
				newFilePath.write(b, 0, data);
				// b만큼 filePath에서 읽어서 newFilePath에 씀
			}
			
			filePath.close();
			newFilePath.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}