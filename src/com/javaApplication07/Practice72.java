package com.javaApplication07;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Practice72 {
    public static void main(String[] args) {
        Employee leader = new Employee();
        leader.name = "홍길동";
        leader.age = 41;

        Department department = new Department();
        department.name = "총무부";
        department.leader = leader;

        try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\DA\\company.dat");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(department);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
