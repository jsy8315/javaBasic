package com.javaFinalProject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {
	private String name;
	private String address;
	private String phonenumber;
	private String birthday;
	private String memberday;
	
	Member() {}
	
	Member(String name, String address, String phonenumber, String birthday, String memberday) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
		this.memberday = memberday;
	}
		
	Scanner sc = new Scanner(System.in);
    // 1.회원확인 메소드
    public void memberIdentify() { 
    	
    	boolean shouldContinue31 = true; 
    	while (shouldContinue31) { // 세번째 while문 중 첫번째 메소드
    	
		System.out.print("회원 이름을 입력하세요 : "); //일단 이 사람이 회원인지 확인하기, 동명이인있을수 있으니까 전화번호까지 해서 
		String inputName = sc.next(); // 이름 입력값 받기
		System.out.print("회원 스마트폰 번호를 \"-\" 없이 입력하세요 : ");
		String inputPhonenumber = sc.next();
		
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DA\\Documents\\GitHub\\finalproject\\member.csv"));
            String line;
            boolean isMemberFound = false;  // 일치하는 회원이 있는지 여부를 저장하는 변수
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // "," 기준으로 분리하고, Member타입의 변수 member로 저장
                if (data[0].equals(inputName) && data[2].equals(inputPhonenumber)) {
                    System.out.println("찾은 멤버 정보 : " + data[0] + data[1] +data[2] + data[3] + data[4]);
                    isMemberFound = true;  // 일치하는 회원이 있었음을 표시
                    System.out.println("이전 화면으로 돌아갑니다."); // 이전 화면으로 돌아가기
                    shouldContinue31 = false; // 수정: shouldContinue 변수를 true로 변경
                    break; // 두번째 while문 탈출
                }
            }
            if (!isMemberFound) {  // 일치하는 회원이 없는 경우에만 문구 출력
                System.out.println("회원이 아닙니다. 회원가입 후 이용 가능합니다.");
                System.out.println("이전 화면으로 돌아갑니다."); // 이전 화면으로 돌아가기
                shouldContinue31 = false; // 수정: shouldContinue 변수를 true로 변경
                break; // 두번째 while문 탈출
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("파일 오류" + e.getMessage());
        }
    }
    }
    // 회원가입하는 메소드
    public void memberAdd() {
    	
    	boolean shouldContinue32 = true; 
    	while (shouldContinue32) { // 세번째 while문 중 두번째 메소드
    		System.out.print("회원의 이름을 입력하세요 : ");
    		String inputName2 = sc.next(); // 
    		System.out.print("회원의 주소를 입력하세요 : ");
    		String inputAddress = sc.next(); // 
    		System.out.print("회원 스마트폰 번호를 \"-\" 없이 입력하세요 : ");
    		String inputPhonenumber2 = sc.next();
    		System.out.print("회원의 생년월일을 1900/09/09 형식으로 입력하세요 : ");
    		String inputBirthday = sc.next(); // 
    		System.out.print("회원가입하는 날짜를 1900/09/09 형식으로 입력하세요 : ");
    		String inputMemberday = sc.next(); // 
    		
            // 새로운 회원 정보를 문자열로 생성
            String newMember = inputName2 + "," + inputAddress + "," + inputPhonenumber2 + "," + inputBirthday + "," + inputMemberday;
            
            try {
                // BufferedWriter를 사용하여 파일에 데이터를 추가함
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\DA\\Documents\\GitHub\\finalproject\\member.csv", true)); // true는 append모드임을 나타냄
                writer.write("\n");
                writer.write(newMember); //
                writer.close();
                System.out.println("새로운 회원 정보가 추가되었습니다.");
                System.out.println("이전 화면으로 돌아갑니다."); // 이전 화면으로 돌아가기
                shouldContinue32 = false; // 수정: shouldContinue 변수를 true로 변경
                break; 
            } catch (IOException e) {
                System.out.println("파일 쓰기 오류가 발생하였습니다.");
                e.printStackTrace();
            }
    	}
        }
    // 3.회원삭제
    public void memberDelete() {
    	
    	boolean shouldContinue33 = true; 
    	while (shouldContinue33) { // 세번째 while문 중 두번째 메소드
    		System.out.print("회원의 이름을 입력하세요 : ");
    		String inputName3 = sc.next(); // 삭제할 회원 이름
    		System.out.print("회원 스마트폰 번호를 \"-\" 없이 입력하세요 : ");
    		String inputPhonenumber3 = sc.next(); // 삭제할 회원 스마트폰 번호
    		
    		// 3.을 하기전 4. 직전회원 삭제 취소를 위해 삭제 전 파일을 복사해놓자
    		 String sourceFile = "C:\\Users\\DA\\Documents\\GitHub\\finalproject\\member.csv";
    	     String destinationFile = "C:\\Users\\DA\\Documents\\GitHub\\finalproject\\memberBeforeDelete.csv";
    	     // memberBeforeDelete란 이름으로 복사

    	        try {
    	            // 입력 스트림 생성
    	            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
    	            // 출력 스트림 생성
    	            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));

    	            // 파일 복사
    	            byte[] buffer = new byte[1024];
    	            int bytesRead;
    	            while ((bytesRead = inputStream.read(buffer)) != -1) {
    	                outputStream.write(buffer, 0, bytesRead);
    	            }

    	            // 스트림 닫기
    	            inputStream.close();
    	            outputStream.close();

    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }
    	        
    	    // 3. 회원삭제
    		
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DA\\Documents\\GitHub\\finalproject\\member.csv"));
                List<String> newLines = new ArrayList<>(); // 수정된 데이터를 저장할 리스트
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data[0].equals(inputName3) && data[2].equals(inputPhonenumber3)) {
                        System.out.println(data[0] + data[2] + " 의 정보를 삭제합니다.");
                        continue; // 삭제 대상 데이터는 저장하지 않음
                    }
                    newLines.add(line); // 삭제 대상이 아닌 데이터는 리스트에 저장, 이 리스트로 파일 만들기
                    
                }
                reader.close(); // 파일 닫기

                // 새로운 파일 만들기
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\DA\\Documents\\GitHub\\finalproject\\member.csv"));
                for (String newLine : newLines) {
                    writer.write(newLine);
                    writer.newLine();
                }
                writer.close(); // 파일 닫기
                System.out.println("삭제가 완료되었습니다.");
                        shouldContinue33 = false; // 수정: shouldContinue 변수를 true로 변경
                        break; // 33 while문 탈출

            } catch (IOException e) {
                System.err.println("파일 오류" + e.getMessage());
            }
    	}
		}
    // 4.직전회원삭제취소
        public void memberDeleteRecovery() {
        	
        	boolean shouldContinue34 = true; 
        	while (shouldContinue34) { // 세번째 while문 중 두번째 메소드
        		System.out.print("직전 회원의 삭제를 취소합니다.");
        		
       		 String sourceFile = "C:\\Users\\DA\\Documents\\GitHub\\finalproject\\memberBeforeDelete.csv";
    	     String destinationFile = "C:\\Users\\DA\\Documents\\GitHub\\finalproject\\member.csv";
    	     // memberBeforeDelete란 이름으로 복사

    	        try {
    	            // 입력 스트림 생성
    	            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
    	            // 출력 스트림 생성
    	            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));

    	            // 파일 복사
    	            byte[] buffer = new byte[1024];
    	            int bytesRead;
    	            while ((bytesRead = inputStream.read(buffer)) != -1) {
    	                outputStream.write(buffer, 0, bytesRead);
    	            }

    	            // 스트림 닫기
    	            inputStream.close();
    	            outputStream.close();
                    System.out.println("삭제 취소가 완료되었습니다.");
                    shouldContinue34 = false; // 수정: shouldContinue 변수를 true로 변경
                    break; // 34 while문 탈출

    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }
        		
    }
}
}
