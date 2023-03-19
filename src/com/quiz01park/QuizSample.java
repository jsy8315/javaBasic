package com.quiz01park;

import java.util.Scanner;

public class QuizSample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // 공사 현장의 x좌표
    int b = sc.nextInt(); // 공사 현장의 y좌표
    int R = sc.nextInt(); // 공사장 소음의 크기
    int N = sc.nextInt(); // 나무 그늘의 수
    
    ConstructionOnPark place1 = new ConstructionOnPark(a, b, R);
    for (int i = 0; i < N; i++) {
      int x = sc.nextInt(); // 나무 그늘의 x좌표
      int y = sc.nextInt(); // 나무 그늘의 y좌표
      ResultByDistance distance1 = new ResultByDistance();
      String print = distance1.result(x, y, a, b, R);
      System.out.println(print);
    
    }
  }
}

