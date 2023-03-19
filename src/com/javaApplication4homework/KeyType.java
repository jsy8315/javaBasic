package com.javaApplication4homework;

//단, 열쇠의 종류는 다음 4종류로 한정한다. 각 열쇠는 사용횟수의 한도가 정해져 있다.


//PADLOCK    (1,024회)
//BUTTON     (10,000회)
//DIAL       (30,000회)
//FINGER     (1,000,000회)

public enum KeyType {
  PADLOCK(1024), 
  BUTTON(10000), 
  DIAL(30000), 
  FINGER(1000000);

  private final int limit;

  KeyType(int limit) {
      this.limit = limit;
  }

  public int getLimit() {
      return limit;
  }
}
