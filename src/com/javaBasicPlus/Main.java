package com.javaBasicPlus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentComparator implements Comparator<Student> {
    compare
}

public class Main {

    public static void main(String[] args) throws Exception {
        List<Student> studens = new ArrayList<>();
        studens.add("박경덕");
        studens.add("이경덕");
        studens.add("오경덕");
        studens.add("김경덕");
        
        Collections.sort(studens); // 
        
        System.out.println(studens);
    }

}
