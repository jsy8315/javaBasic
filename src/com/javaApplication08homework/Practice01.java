package com.javaApplication08homework;

import java.io.*;
import java.net.*;

public class Practice01 {
	public static void main(String[] args) throws IOException {
		try { 
			URL icoUrl = new URL("https://alimipro.com/favicon.ico");
			// 원본사진 주소를 url 객체를 생성해 받음
			InputStream in = icoUrl.openStream();
			// 지정된 URL인 icoUrl에서 데이터를 읽어, InputStream타입의 in으로 반환
			OutputStream out = new FileOutputStream("C:\\Users\\DA\\icon.ico");
			// 저장되는 파일명과 경로를 지정
			
			byte[] b = new byte[1024];
			// 사이즈 지정(한번에 read, write할)
			int data;
			while ((data = in.read(b)) > 0) {
				out.write(b, 0, data);
				// b만큼 in에서 읽어서 out에 씀
				// 0쓰는 이유 buffer 내부적으로 비워지니까?? 
			}
			
			in.close(); // 위에꺼 close하다가 터지면 밑에꺼 안됨, finally사용하기
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
