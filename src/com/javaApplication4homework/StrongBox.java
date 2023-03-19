package com.javaApplication4homework;
// 응용 연습문제 04장
public class StrongBox<C> {
//다음 조건을 만족하는 금고인 StrongBox 클래스를 정의하시오.
//1. 금고 클래스에 담는 인스턴스의 타입은 미정
  public C content;
//2. 금고에는 1개의 인스턴스를 담을 수 있음
//3. put() 메서드로 인스턴스를 저장하고 get() 메서드로 인스턴스를 얻을 있음
  public C get() {
    return this.content;
  }
  public void put(C content) {
      this.content = content;
  }
//4. get() 으로 얻을 때는 별도의 타입 캐스팅을 사용하지 않아도 됨

}
/*
 연습문제 4-1에서 작성한 StrongBox 클래스에 열쇠의 종류를 나타내는 열거형 KeyType을 정의하고,
다음 내용을 반영하여 StrongBox 클래스를 수정하시오.

열쇠의 종류를 나타내는 필드 변수
열쇠의 종류를 받는 생성자

단, 열쇠의 종류는 다음 4종류로 한정한다. 각 열쇠는 사용횟수의 한도가 정해져 있다.


PADLOCK    (1,024회)
BUTTON     (10,000회)
DIAL       (30,000회)
FINGER     (1,000,000회)

금고에서 get() 메서드를 호출할 때 마다 사용횟수를 카운트하고 각 열쇠의 사용횟수에 도달하기 전에는 null을 리턴한다.
*/
