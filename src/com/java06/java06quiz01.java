package com.java06;
import java.util.*;

public class java06quiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 공사 현장의 x좌표
        int b = sc.nextInt(); // 공사 현장의 y좌표
        int R = sc.nextInt(); // 공사장 소음의 크기
        int N = sc.nextInt(); // 나무 그늘의 수
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt(); // 나무 그늘의 x좌표
            int y = sc.nextInt(); // 나무 그늘의 y좌표
            double distance = Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
            if (distance >= (double) R) {
                System.out.println("silent");
            }
            else {
                System.out.println("noisy");
            }
            
        }
    }
}
// 객체 지향 최대한 넣어보기
// 공사 현장, 나, 나무
