package com.javaApplication05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice02 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		for(int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {
				System.out.println(nums.get(i) + 1); // +1
			}
		}
		System.out.println("===");
		
		nums.stream()
			.filter((num) -> num % 2 == 0) // 거르기
			.map((num) -> num + "번") // 변환
			.forEach((num) -> System.out.println(num + 1)); // 뺑뺑이
		
		
		
		
		List<String> names = new ArrayList<>();
		names.add("박경덕");
		names.add("박준하");
		names.add("이동학");
		names.add("박태현");
		List<String> parks = getParkList(names);
		System.out.println( names.stream().filter(name -> name.startsWith("박")).collect(Collectors.toList()));
		}
	
	public static List<String> getParkList(List<String>names){
		return names.stream().filter(name -> name.startsWith("박")).collect(Collectors.toList());
		
		//List<String> results = new ArrayList<>();
	}
	
	}

