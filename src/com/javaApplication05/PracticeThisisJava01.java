package com.javaApplication05;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
// ctrl shit o 

public class PracticeThisisJava01 {
	public static void main(String[] args) {
		// set 컬렉션 생성
		Set<String> mySet1 = new HashSet<>();
		mySet1.add("홍길돌");
		mySet1.add("신용권");
		mySet1.add("김자바");
		
		// Steam을 이용한 요소 반복 처리
		Stream<String> myStream = mySet1.stream(); // 스트림 얻기
		myStream.forEach(name -> System.out.println(name)); // 람다식: 요소 처리 방법
		
	}
}
