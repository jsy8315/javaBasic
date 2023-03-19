package com.quiz01park;

public class ResultByDistance {
  
  String result (int x, int y, int a, int b, double R) { 
    double distance1 = Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
    if (distance1 >= (double) R) {
      return "silent";
    }
    else {
      return "noisy";
    }
  }
}
