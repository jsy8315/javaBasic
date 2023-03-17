package com.javabookCh05;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1; // 배열 변수 arr1 선언
        int[] arr2; // 배열 변수 arr2 선언
        int[] arr3; // 배열 변수 arr3 선언
        
        arr1 = new int[] { 1, 2, 3 }; // 배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
        arr2 = new int[] { 1, 2, 3 }; // 배열 
        arr3 = arr2;
        
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
        
        int[] intArray = null;
        intArray[0] = 10;
        System.out.println(intArray);
    }
}
