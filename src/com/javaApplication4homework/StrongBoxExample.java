package com.javaApplication4homework;

public class StrongBoxExample {

  public static void main(String[] args) {
    StrongBox<JipMoonSeoBox> jipmoonseoBox1 = new StrongBox<>();
    
    jipmoonseoBox1.put(new JipMoonSeoBox());
    
    JipMoonSeoBox ApgujeongHyundai = jipmoonseoBox1.get();
    
  }

}
