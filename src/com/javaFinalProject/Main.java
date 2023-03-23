package com.javaFinalProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            Menu firstMenu = new Menu();
            int layer1MenuInput = firstMenu.layer1Menu();

            switch (layer1MenuInput) {
                case 1:
                    System.out.println("대출을 시작합니다.");
                    // 책 검색
                    // 대출 가능 여부 알려주기
                    // 대출하고 처리
                    break;

                case 2:
                    boolean shouldContinue2 = true;
                    while (shouldContinue2) {
                        Menu secondMenu = new Menu();
                        int layer2SecondMenuInput = secondMenu.layer2SecondMenu();

                        switch (layer2SecondMenuInput) {
                            case 1:
                            	// 1.회원확인
                                break;

                            case 2:
                                // 2.회원가입
                                break;

                            case 3:
                                // 3.회원삭제
                                break;

                            case 4:
                                // 4.직전회원삭제취소
                                break;

                            case 5:
                                // 5.이전화면
                                System.out.println("이전화면으로 돌아갑니다.\n");
                                shouldContinue2 = false; // 수정: shouldContinue 변수를 true로 변경
                                break;
                        }
                    }
                    break;

                case 3:
                    // 도서관리
                    break;

                case 4:
                    // 도연시
                    break;

                case 5:
                    // 종료
                    System.out.println("종료합니다.");
                    shouldContinue = false;
                    break;
            }
        }
    }
}


